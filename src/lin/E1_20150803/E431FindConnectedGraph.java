package lin.E1_20150803;

/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/find-the-connected-component-in-the-undirected-graph/
 * http://cherylintcode.blogspot.com/2015/07/find-connected-component-in-undirected.html
 */

import java.util.*;

//Find the Connected Component in the Undirected Graph
//
//        18% Accepted
//        Find the number connected component in the undirected graph. Each node in the graph contains a label and a list of its neighbors. (a connected component (or just component) of an undirected graph is a subgraph in which any two vertices are connected to each other by paths, and which is connected to no additional vertices in the supergraph.)
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given graph:
//
//        A------B  C
//        \     |  |
//        \    |  |
//        \   |  |
//        \  |  |
//        D   E
//        Return {A,B,D}, {C,E}. Since there are two connected component which is {A,B,D}, {C,E}
//
//        Note

/**
 * Definition for Undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class E431FindConnectedGraph {
    class UndirectedGraphNode {
        int label;
        ArrayList<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    };
    /**
     * @param nodes a array of Undirected graph node
     * @return a connected set of a Undirected graph
     */
    public List<List<Integer>> connectedSet(ArrayList<UndirectedGraphNode> nodes) {
        // Write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        Set<UndirectedGraphNode> visited = new HashSet<UndirectedGraphNode>();
        for(UndirectedGraphNode node : nodes){
            if(!visited.contains(node)){
                dfs(node, visited, path);
                Collections.sort(path);
                result.add(new ArrayList<Integer>(path));
                path.clear();
            }
        }
        return result;
    }

    public void dfs(UndirectedGraphNode node, Set<UndirectedGraphNode> visited, List<Integer> path){
        visited.add(node);
        path.add(node.label);
        for(UndirectedGraphNode n : node.neighbors){
            if(!visited.contains(n)){
                dfs(n, visited, path);
            }
        }
    }
}
