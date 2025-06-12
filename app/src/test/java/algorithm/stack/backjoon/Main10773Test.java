package algorithm.stack.backjoon;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main10773Test {

    private final InputStream originalSystemIn = System.in; // 원래 System.in 저장
    private final PrintStream originalSystemOut = System.out; // 원래 System.out 저장 (출력 테스트 시 필요)
    private ByteArrayOutputStream outputStreamCaptor; // System.out 캡처용

    @BeforeEach
    void setUp() {
        // 테스트 전에 System.out을 캡처하기 위해 ByteArrayOutputStream으로 리다이렉션
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        // 테스트 실행 후, 원래의 System.in과 System.out으로 되돌림
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    void testMain() {
        String input = """
                4
                3
                0
                4
                0
                """;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main10773.main(new String[] {});
        String actualOutput = outputStreamCaptor.toString();
        Assertions.assertEquals("0",actualOutput);
    }
}
