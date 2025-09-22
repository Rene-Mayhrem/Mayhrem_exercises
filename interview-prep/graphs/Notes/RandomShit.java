package graphs.Notes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RandomShit {
    public void dfs (Node node, Set<Node> visited) {
        if (node == null || visited.contains(node)) return;
        visited.add(node);
        for (Node current : node.neighbors) dfs(current, visited);
    }
}

class Node {
    int value;
    List<Node> neighbors;

    public Node (int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }
}