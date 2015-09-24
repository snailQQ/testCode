package lin.M16_20150821;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/route-between-two-nodes-in-graph/
 */
//Route Between Two Nodes in Graph
//
//        37% Accepted
//        Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given graph:
//
//        A----->B----->C
//        \     |
//        \    |
//        \   |
//        \  v
//        ->D----->E
//        for s = B and t = E, return true
//
//        for s = D and t = C, return false
public class M176RouteBetweenTwoNodes {
    /**
     * Definition for Directed graph.
     * class DirectedGraphNode {
     *     int label;
     *     ArrayList<DirectedGraphNode> neighbors;
     *     DirectedGraphNode(int x) {
     *         label = x;
     *         neighbors = new ArrayList<DirectedGraphNode>();
     *     }
     * };
     */
    class DirectedGraphNode {
        int label;
        ArrayList<DirectedGraphNode> neighbors;
        DirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<DirectedGraphNode>();
        }
    };
    /**
    * @param graph: A list of Directed graph node
    * @param s: the starting Directed graph node
    * @param t: the terminal Directed graph node
    * @return: a boolean value
    */
    public boolean hasRoute(ArrayList<DirectedGraphNode> graph,
                            DirectedGraphNode s, DirectedGraphNode t) {
        // write your code here
        if (s == t) {
            return true;
        }
        if (graph == null || graph.size() == 0 || s == null || t == null) {
            return false;
        }
        Set<DirectedGraphNode> visited = new HashSet<DirectedGraphNode>();
        Stack<DirectedGraphNode> stack = new Stack<DirectedGraphNode>();
        stack.push(s);
        while (!stack.isEmpty()) {
            DirectedGraphNode node = stack.pop();
            if (visited.contains(node)) {
                continue;
            }
            visited.add(node);
            for (DirectedGraphNode neighbor : node.neighbors) {
                if (neighbor == t) {
                    return true;
                }
                stack.push(neighbor);
            }
        }
        return false;
    }

}
