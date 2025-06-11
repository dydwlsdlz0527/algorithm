package algorithm.twopointer.baekjoon;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main6137Test {

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
    void testTwoPointer() {
        String input = "6\nA\nC\nD\nB\nC\nB";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main6137.twoPointer();
        String expectedOutput = "ABCBCD";
        Assertions.assertEquals("ABCBCD", expectedOutput);
    }
}
