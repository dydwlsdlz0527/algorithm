package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheDifferenceTest {

    @Test
    void testFindTheDifference() {

        String s = "abcd";
        String t = "abcde";
        
        Assertions.assertEquals('e', FindTheDifference.findTheDifference(s, t));
        
    }
}

