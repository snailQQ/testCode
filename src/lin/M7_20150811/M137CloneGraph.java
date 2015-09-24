package lin.M7_20150811;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Paul on 8/10/15.
 * http://www.lintcode.com/en/problem/clone-graph/#
 * http://www.cnblogs.com/springfor/p/3874591.html
 */
//Clone Graph
//
//        25% Accepted
//        Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
//
//
//        OJ's undirected graph serialization:
//        Nodes are labeled uniquely.
//
//        We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
//        As an example, consider the serialized graph {0,1,2#1,2#2,2}.
//
//        The graph has a total of three nodes, and therefore contains three parts as separated by #.
//
//        First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
//        Second node is labeled as 1. Connect node 1 to node 2.
//        Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
//        Visually, the graph looks like the following:
//
//        1
//        / \
//        /   \
//        0 --- 2
//        / \
//        \_/
public class M137CloneGraph {
    /**
     * Definition for undirected graph.
     * class UndirectedGraphNode {
     *     int label;
     *     ArrayList<UndirectedGraphNode> neighbors;
     *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
     * };
     */
    class UndirectedGraphNode {
        int label;
        ArrayList<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    };
    /**
     * @param node: A undirected graph node
     * @return: A undirected graph node
     */
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        // write your code here
        if(node == null) {
            return node;
        }
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        UndirectedGraphNode head = new UndirectedGraphNode(node.label);
        hm.put(node, head);
        dfs(hm, node);
        return head;



    }

    private void dfs(HashMap<UndirectedGraphNode, UndirectedGraphNode> hm, UndirectedGraphNode node) {
        if(node == null) {
            return;
        }

        for(UndirectedGraphNode neighbor : node.neighbors) {
            if(!hm.containsKey(neighbor)) {
                UndirectedGraphNode newNeighbor = new UndirectedGraphNode(neighbor.label);
                hm.put(neighbor, newNeighbor);
                dfs(hm, neighbor);
            }
            hm.get(node).neighbors.add(hm.get(neighbor));
        }
    }
}
