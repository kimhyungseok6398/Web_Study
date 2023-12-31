package tests;

import members.JoinService;
import members.JoinValidator;
import members.Users;
import members.ValidationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;



import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원 가입 테스트")
public class JoinTest1 { // 모든 것을 실행
private JoinService joinService;

    private Users getUserSuccess(){
    Users users = new Users();
    users.setUserId("user01");
    users.setUserPw("_aA123456");
    users.setUserNm("사용자01");
    users.setRegDt(LocalDateTime.now());

    return users;
    }

    private Users getUserFail(){
        return new Users();
    }
    @BeforeEach // 테스트 전에 실행될 코드를 지정, 기본적인 변수 초기화
   // 초기화 개념, 객체를 생성해준다
    void init(){
        JoinValidator joinValidator = new JoinValidator();

    joinService = new JoinService(joinValidator); // 주입하는 부분
    }

    @Test
    @DisplayName("회원 가입성공시 예외 발생 없음")
    void joinSuccessTest(){

       // assertEquals(0,joinService.join());
/**
 * 실제 값이 기대하는 값과 같은지 검사한다.
 *
 */
        assertDoesNotThrow(()-> {
        joinService.join(getUserSuccess());
        });
        // 예외발생이 없을때 통과하는 테스트
        // 성공시 발생하는 데이터가 들어가게 된다.
    }

    /**
     * 데이터 검증 테스트
     *
     */
    @Test
    @DisplayName("필수 항목(userId,userPw, userNm) 검증, 검증 실패시 ValidationException 발생")
    void requiredFieldsTest(){
    /**    // userId null 또는 빈값(공백포함)

        assertThrows(ValidationException.class,()->{
        // users에서 값이 없는경우에 Validation 예외가 발생

            Users user = getUserFail();
            //Users user = getUserSuccess();
            joinService.join(user);
        });
        // userId null 또는 빈값(공백포함)

        assertThrows(ValidationException.class,()->{
            System.out.println("여기실행");
            // users에서 값이 없는경우에 Validation 예외가 발생

            Users user = getUserFail();
            user.setUserId("   ");
            joinService.join(user);
        });// 위에것이 실행이 실패되면 밑에것은 아예 실행되지 않는다.
    **/// userId null 또는 빈값(공백포함)
    assertAll(
            () -> { // 예외 발생여부
                ValidationException thrown = assertThrows(ValidationException.class, () -> {
                    Users user = getUserSuccess();
                    user.setUserId(null);
                    joinService.join(user);
                });
                    // 정확한 예외 발생 문구
                String message = thrown.getMessage();
                // 원하는 문구가 포함되어 있는지
                assertTrue(message.contains("아이디를 입력"));

            },
            () -> assertThrows(ValidationException.class,() -> {
                Users user = getUserSuccess();
                user.setUserId("   ");
                joinService.join(user);
            }), // userPw null 또는 빈값(공백포함)

            () -> assertThrows(ValidationException.class,() -> {
                Users user = getUserSuccess();
                user.setUserPw(null);
                joinService.join(user);
            }),
            () -> assertThrows(ValidationException.class,() -> {
                Users user = getUserFail();
                user.setUserPw("   ");
                joinService.join(user);
            }),// userPw null 또는 빈값(공백포함)

            () -> assertThrows(ValidationException.class,() -> {
                Users user = getUserSuccess();
                user.setUserNm(null);
                joinService.join(user);
            }),
            () -> assertThrows(ValidationException.class,() -> {
                Users user = getUserFail();
                user.setUserNm("   ");
                joinService.join(user);
            }) // userNm null 또는 빈값(공백포함)
    );
    }   // 현재 값이 널값이거나 비어있는 값
    // 이 방식보다 한꺼번에 테스트 할수 있는
    // assertAll 방식

    @Test
    @DisplayName("UserId는 6자리 이상 입력검증, 실패시 ValidationException, 아이디는 6자리 이상입력하세요. ")
    void userIdLengthCheckTest(){

    }

    @Test
    @Disabled
    @DisplayName("단위 테스트 연습")
    void testEx(){
        //JoinService joinService = new JoinService();
        //assertTrue(joinService.join()); // 값이 트루인지 검사
        //assertFalse(joinService.join()); // 값이 펄스인지 검사
        //fail(); // 어떤 로직이 많이 포함이 되어 있을때 이러한 로직에 유입되면 그것은 실패이다
    }
}
