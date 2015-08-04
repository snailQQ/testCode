//package lin;
//
///**
// * Created by Paul on 8/2/15.
// * http://www.lintcode.com/en/problem/find-the-connected-component-in-the-undirected-graph/
// */
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
//
///**
// * Definition for Undirected graph.
// * class UndirectedGraphNode {
// *     int label;
// *     ArrayList<UndirectedGraphNode> neighbors;
// *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
// * };
// */
//public class E431FindConnectedGraph {
//    /**
//     * @param nodes a array of Undirected graph node
//     * @return a connected set of a Undirected graph
//     */
//    public List<List<Integer>> connectedSet(ArrayList<UndirectedGraphNode> nodes) {
//        // Write your code here
//    }
//}
