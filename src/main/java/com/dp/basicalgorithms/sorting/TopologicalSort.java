package com.dp.basicalgorithms.sorting;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * Topological sort with Adjacency list
 */
public class TopologicalSort {

    private int vertex;
    private ArrayList<ArrayList<Integer>> adj;

    public TopologicalSort(int size){
        this.vertex = size;
        this.adj = new ArrayList<ArrayList<Integer>>(size);

        for(int i=0; i<size; i++){
            adj.add(new ArrayList<>());
        }

        }
    public void addEdge(int v, int e){
        adj.get(v).add(e);
    }


    void topoSort(){
        Stack<Integer> stack = new Stack();
        boolean[] visited = new boolean[vertex];

        for(int i=0; i<vertex; i++){
            if(visited[i]==false) {
                topoSortUtil(i, visited, stack);
            }
        }
    }

    private void topoSortUtil(int i, boolean[] visited, Stack<Integer> stack) {
        visited[i] = true;

        Iterator itr = this.adj.get(i).iterator();
        while(itr.hasNext()){
        int value = (Integer) itr.next();

        if(!visited[value]){
            topoSortUtil(value,visited,stack);
        }
        }
        stack.push(i);
    }
}

