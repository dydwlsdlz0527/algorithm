package algorithm.dp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinCostClimbingStairsTest {

    @Test
    void testTopDown() {
        int result = MinCostClimbingStairs.topDown(new int[]{10, 15, 20});
        Assertions.assertEquals(15, result);
    }

    @Test
    void testButtomUp() {
        int result = MinCostClimbingStairs.buttomUp(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        Assertions.assertEquals(6, result);
    }
}
