package baekjoon.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main9095Test {

    private final InputStream originalSystemIn = System.in; // 원래 System.in 저장
    private final PrintStream originalSystemOut = System.out; // 원래 System.out 저장
    private ByteArrayOutputStream outputStreamCaptor;

    @BeforeEach
    void setUp() {
        // 테스트 전에 System.out을 캡처하도록 리다이렉트
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        // 테스트 후에 System.in과 System.out을 원래대로 복원
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    void testSolution() {
        Main9095 main = new Main9095();
        String input = "3\n4\n7\n10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        main.Solution();
        String expectedOutput = "7\n44\n274\n"; // \n은 운영체제 독립적인 줄바꿈
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void testSolution2() {
        Main9095 main = new Main9095();
        String input = "3\n4\n7\n10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        main.Solution2();
        String expectedOutput = "7\n44\n274\n"; // \n은 운영체제 독립적인 줄바꿈
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}
