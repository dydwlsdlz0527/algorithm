package algorithm.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    @Test
    void testTwoSum() {
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        Assertions.assertEquals(new int[]{0,1},ts.twoSum(nums, target));
    }
}
