package exam07_17_12_Lombok_기본어노테이션_1;

import java.time.LocalDateTime;

public class Users {
    private String userId; // 아이디

    private String userPw;  // 비밀번호

    private String userNm;  // 회원명

    private LocalDateTime regDt;    // 회원 가입일시

    private Users() {} // 객체를 외부에서 되지 않게 하기위해

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userNm='" + userNm + '\'' +
                ", regDt=" + regDt +
                '}';
    }

    static class Builder{
    private  Users instance = new Users();

    public Builder userId(String userId){
        instance.userId = userId;
        return this;
    }
    public Builder userPw(String userPw){
        instance.userPw = userPw;
        return this;
    }
    public Builder userNm(String userNm){
        instance.userNm = userNm;
        return this;
    }
    public Builder regDt(LocalDateTime regDt){
       return this;
    }
    public Users build(){
        return instance;
    }
    }
}
