package algorithm.graph;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GraphBFSTest {
    @Test
    void testBfs() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        GraphBFS bfs = new GraphBFS();
        List<Integer> bfsResult = bfs.bfs(root);
        System.out.println(bfsResult);
         List<Integer> expected = Arrays.asList(1,2,3,4,5,6);
        Assertions.assertEquals(expected, bfsResult);
    }
}
