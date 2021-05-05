package com.dp.basicalgorithms.graphs;


import java.util.ArrayList;
import java.util.List;

/**
 * We will represent a graph as adjacency list in this class
 */
public class GraphAdjacencyList {

    private int nodes;
    private List<List<Integer>> adjList;


    GraphAdjacencyList(int nodes) {
        this.nodes = nodes;
        adjList = new ArrayList<>(nodes);
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dst){
        adjList.get(src).add(dst);
        adjList.get(dst).add(src);
    }

    void iterate(int src){
        adjList.get(src).forEach(System.out::println);
    }


    public static void main(String[] args) {
        GraphAdjacencyList g = new GraphAdjacencyList(7);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,5);
        g.addEdge(4,6);
        g.addEdge(5,6);

        g.iterate(1);
    }


}
