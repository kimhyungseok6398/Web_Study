package exam07_17_12_maven_설정;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@Log // 로그란 변수가 추가

public class Users2 {
    private final String userId; // 아이디
    @NonNull
    private  String userPw;  // 비밀번호

    private String userNm;  // 회원명

    private LocalDateTime regDt;    // 회원 가입일시


}
