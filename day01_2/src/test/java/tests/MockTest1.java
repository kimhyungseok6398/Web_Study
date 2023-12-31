package tests;

import exam07_17_12_maven_설정.Calculator;
import exam07_17_12_maven_설정.Scheduler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class) // 확장기능
public class MockTest1 {

    @Mock
    Calculator cal;
    @Mock
    Scheduler scheduler;
    @Test
    void test1(){
        //Calculator cal = mock(Calculator.class);
        given(cal.add(10,20)).willReturn(30); // 이값으로 정하고 반환값도 정함

        int result = cal.add(10,20);
        assertEquals(30,result);
        //System.out.println(result);
    }
    @Test
    void test2(){
        //Scheduler scheduler = mock(Scheduler.class);    // 객체생성
        given(scheduler.view(2023,2,31))
                .willThrow(IllegalArgumentException.class);

        assertThrows(IllegalArgumentException.class,() ->{
        scheduler.view(2023,2,31);
        });
    }
    @Test
    void test3(){
        //Scheduler scheduler = mock(Scheduler.class);
        willThrow(RuntimeException.class)
                .given(scheduler)
                .print();
        // 반환값이 없을때는 willThrow 예외 발생

        assertThrows(RuntimeException.class, () ->{
            scheduler.print();
        });
    }
}
