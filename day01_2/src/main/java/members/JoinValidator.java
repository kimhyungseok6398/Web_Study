package members;


import vaildators.RequiredValidator;
import vaildators.Validator;

public class JoinValidator implements Validator<Users>, RequiredValidator { // RequiredValidator 기능추가


    @Override
    public void check(Users user) {
//        String userId = user.getUserId();
//        if (userId == null || userId.isBlank()) {
//            throw new ValidationException("아이디를 입력하세요");
//        } // 똑같이 반복이 되면 효율적인 코드가 된다
//
//        String userPw = user.getUserId();
//        if (userId == null || userId.isBlank()) {
//            throw new ValidationException("비밀번호를 입력하세요");
//        }

        // RequiredValidator 추가 기능으로서 코드를 더 간단히

        /**  필수 항목 체크 S */
        String userId = user.getUserId();
        String userPw = user.getUserPw();
        String userNm = user.getUserNm();

        checkRequired(userId, new ValidationException("아이디를 입력하세요"));
        checkRequired(userPw, new ValidationException("비밀번호를 입력하세요"));
        checkRequired(userNm, new ValidationException("회원명을 입력하세요"));
        /** 필수 항목 체크 E */
    }
}
