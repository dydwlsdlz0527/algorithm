package algorithm.twopointer.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    @Test
    void testTwoSum() {
        int[] nums = { 4, 1, 9, 7, 5, 3, 16 };
        int target = 14;
        Assertions.assertTrue(TwoSum.twoSum(nums, target));
    }

    @Test
    void testTwoSum2() {
        int[] nums = { 4, 1, 9, 7, 5, 3, 16 };
        int target = 14;
        Assertions.assertTrue(TwoSum.twoSum2(nums, target));
    }

    @Test
    void testTwoSum3(){
        int[] nums = { 4, 1, 9, 7, 5, 3, 16 };
        int target = 14;
        Assertions.assertTrue(TwoSum.twoSum3(nums, target));
    }

}
