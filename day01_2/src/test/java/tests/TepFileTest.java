package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;

public class TepFileTest {
    @TempDir
    File tmpFile;

    @Test
    void test(){
        String path = tmpFile.getAbsolutePath();
        System.out.println(path);
    }
    @AfterEach
    void cleanTemp(){
        if (tmpFile.exists()){  // 사용하고
            tmpFile.delete();   // 제거
        }

    }
}
