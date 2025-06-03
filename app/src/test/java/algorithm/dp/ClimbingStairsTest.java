package algorithm.dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {
    @Test
    void testClimbStairs() {
        ClimbingStairs cs = new ClimbingStairs();
        int n = 3;
        int count = cs.climbStairs(n);
        assertEquals(3, count);
    }
}
