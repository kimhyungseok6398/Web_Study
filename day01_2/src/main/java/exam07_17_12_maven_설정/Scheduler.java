package exam07_17_12_maven_설정;

public interface Scheduler {
    String view(int year, int month, int day);
    // 가짜 데이터를 만들어주는 방식
    // 맞지 않는 날짜등 정보가 들어오면 예외 발생

    void print();

}

