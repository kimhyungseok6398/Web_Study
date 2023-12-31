package exam07_17_12_maven_설정;

import lombok.*;
import lombok.extern.java.Log;

import java.time.LocalDateTime;

//@Setter @Getter @ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE) // private 범위 내에서 기본 생성자 생성
@Data
@Log
public class Users {
    private String userId; // 아이디

    private String userPw;  // 비밀번호

    private String userNm;  // 회원명

    private LocalDateTime regDt;    // 회원 가입일시

    public void printMethod(){
        log.info("테스트 메세지!");
    }
}
