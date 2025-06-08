package algorithm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathsTest {
    @Test
    void testUniquePaths() {
        int unique_paths = UniquePaths.uniquePaths(3, 2);
        Assertions.assertEquals(3, unique_paths);
    }
    
    @Test
    void testTabulation() {
        int unique_paths = UniquePaths.tabulation(3, 2);
        Assertions.assertEquals(3, unique_paths);
    }
}
