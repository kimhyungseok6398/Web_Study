package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutTest {
    @Test
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS) // 2초내에 성공,
    void test1(){
        try {
            Thread.sleep(1000); // 초단위
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
