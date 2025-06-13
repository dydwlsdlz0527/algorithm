package algorithm.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DailyTemperatureTest {

    @Test
    void testSolution() {
        int[] tempArr = {73, 74, 75, 71, 69, 72, 76, 73};
        Assertions.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, DailyTemperature.solution(tempArr));
    }
}
