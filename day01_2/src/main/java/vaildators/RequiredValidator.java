package vaildators;

public interface RequiredValidator { // 필수 항목을 검증하는 Validator
 default void checkRequired(String str, RuntimeException e) { // ValidationException에 있는 상속 다형성을 이용, RuntimeException
 if (str == null || str.isBlank()){
     throw  e;
 }
 }
}
