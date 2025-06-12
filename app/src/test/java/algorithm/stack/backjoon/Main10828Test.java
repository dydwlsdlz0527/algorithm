package algorithm.stack.backjoon;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main10828Test {

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
                14
                push 1
                push 2
                top
                size
                empty
                pop
                pop
                pop
                size
                empty
                pop
                push 3
                empty
                top
                """;

        // 백준 예제 출력 그대로 복사
        String expectedOutput = """
                2
                2
                0
                2
                1
                -1
                0
                1
                -1
                0
                3
                """;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main10828.main();
        String actualOutput = outputStreamCaptor.toString();
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
