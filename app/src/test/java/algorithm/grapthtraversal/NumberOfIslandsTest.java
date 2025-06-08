package algorithm.grapthtraversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {
    @Test
    void testBfs() {
        char[][] grid = {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '1' }
        };
        Assertions.assertEquals(2,NumberOfIslands.bfs(grid));
    }
}
