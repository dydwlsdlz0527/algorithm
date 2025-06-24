package algorithm.hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveTest {

    @Test
    void testLongestConsecutive() {

        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int actualResult = LongestConsecutive.longestConsecutive(nums);
        Assertions.assertEquals(9, actualResult);
    }
}
