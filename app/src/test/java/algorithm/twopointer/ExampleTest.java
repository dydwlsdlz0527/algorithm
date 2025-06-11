package algorithm.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void testReverseString() {
        String[] expectedArray = Example.reverseString(new String[]{"h","e","l","l","o"});
        Assertions.assertArrayEquals(new String[]{"o","l","l","e","h"}, expectedArray);
    }
    
    @Test
    void testReverseCollection(){
        String[] expectedArray = Example.reverseCollection(new String[]{"h","e","l","l","o"});
        Assertions.assertArrayEquals(new String[]{"o","l","l","e","h"}, expectedArray);
    }
}
