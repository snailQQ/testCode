package lin.M17_20150822;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Paul on 8/22/15.
 * http://www.lintcode.com/en/problem/topological-sorting/
 * http://www.cnblogs.com/lishiblog/p/4187867.html
 */
//Topological Sorting
//
//        25% Accepted
//        Given an directed graph, a topological order of the graph nodes is defined as follow:
//
//        For each directed edge A -> B in graph, A must before B in the order list.
//        The first node in the order can be any node in the graph with no nodes direct to it.
//        Find any topological order for the given graph.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For graph as follow:
//
//        picture
//
//        The topological order can be:
//
//        [0, 1, 2, 3, 4, 5]
//        [0, 2, 3, 1, 5, 4]
//        ...
//        Note
//        You can assume that there is at least one topological order in the graph.
//
//        Challenge
//        Can you do it in both BFS and DFS?
public class M127TopologicalSorting {
    /**
     * Definition for Directed graph.
     * class DirectedGraphNode {
     *     int label;
     *     ArrayList<DirectedGraphNode> neighbors;
     *     DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
     * };
     */
    class DirectedGraphNode {
        int label;
        ArrayList<DirectedGraphNode> neighbors;
        DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
    };
    /**
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
        if(graph == null) {
            return graph;
        }

        Stack<DirectedGraphNode> stack = new Stack<DirectedGraphNode>();
        ArrayList<DirectedGraphNode> visited = new ArrayList<DirectedGraphNode>();
        for(DirectedGraphNode node : graph) {
            if(!visited.contains(node)) {
                dfs(stack, visited, node);
            }
        }

        ArrayList<DirectedGraphNode> returnlist = new ArrayList<DirectedGraphNode>();
        while(!stack.isEmpty()) {
            returnlist.add( stack.pop());
        }
        return returnlist;
    }

    private void dfs(Stack<DirectedGraphNode> stack, ArrayList<DirectedGraphNode> visited, DirectedGraphNode node) {
        visited.add(node);
        for(DirectedGraphNode newNode : node.neighbors) {
            if(!visited.contains(newNode)) {
                dfs(stack, visited, newNode);
            }
        }
        stack.push(node);
    }
}
