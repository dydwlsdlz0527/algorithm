package algorithm.dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {
    @Test
    void testClimbStairs() {
        ClimbingStairs cs = new ClimbingStairs();
        int n = 3;
        int count = cs.climbStairs(n);
        assertEquals(3, count);
    }

    @Test
    void testTopdown() {
        ClimbingStairs cs = new ClimbingStairs();
        int n = 5;
        Assertions.assertEquals(8,cs.topdown(n));
    }

    @Test
    void testBottomup() {
        ClimbingStairs cs = new ClimbingStairs();
        int n = 5;
         Assertions.assertEquals(8,cs.bottomup(n));
    }
}
