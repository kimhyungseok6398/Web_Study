package tests;

import org.junit.jupiter.api.*;

public class LifeCycleTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll");
    }
    @BeforeEach
    void beforeEach(){ // 주로 초기화 작업
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach(){   // 주로 정의 작업
        System.out.println("AfterEach");
    }
    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test3(){
        System.out.println("test3");
    }


}
