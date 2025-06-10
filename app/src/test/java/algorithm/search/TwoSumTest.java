package algorithm.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import algorithm.twopointer.leetcode.TwoSum;

public class TwoSumTest {
    @Test
    void testTwoSum() {
        TwoSum ts = new TwoSum();
        int[] nums = { 4, 1, 9, 7, 5, 3, 16 };
        int target = 14;
        Assertions.assertTrue(ts.twoSum(nums, target));
    }

    @Test
    void testTwoSum2() {
        TwoSum ts = new TwoSum();
        int[] nums = { 4, 1, 9, 7, 5, 3, 16 };
        int target = 14;
        Assertions.assertTrue(ts.twoSum2(nums, target));
    }

}
