package exam07_17_12_Lombok_기본어노테이션_2;

import lombok.Builder;
import lombok.ToString;

import java.time.LocalDateTime;

@Builder
@ToString
public class Users {
    @ToString.Exclude // userId는 ToString 출력에서 제외
    private String userId; // 아이디

    private String userPw;  // 비밀번호

    private String userNm;  // 회원명

    private LocalDateTime regDt; // 회원 가입 일시
}
