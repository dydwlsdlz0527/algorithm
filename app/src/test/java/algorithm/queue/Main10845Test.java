package algorithm.queue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main10845Test {

    private final InputStream originalSystemIn = System.in;
    private final OutputStream originalSystemOut = System.out;
    private ByteArrayOutputStream outputStreamCaptor;

    @BeforeEach
    void setUp() {
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setIn(originalSystemIn);
        System.setOut(new PrintStream(originalSystemOut));
    }

    @Test
    void testMain() {
        String input = """
                15
                push 1
                push 2
                front
                back
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
                front
                """;
        String expectedResult = """
                1
                2
                2
                0
                1
                2
                -1
                0
                1
                -1
                0
                3
                """;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main10845.main(new String[] {});
        String actualOutput = outputStreamCaptor.toString();
        Assertions.assertEquals(expectedResult, actualOutput);
    }
}
