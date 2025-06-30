package algorithm.graph;

public class GraphDFS {

    public void dfs(Node node) {
        
        if (node == null) {
            return;
        }
        dfs(node.left);
        dfs(node.right);
    }

}

class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}