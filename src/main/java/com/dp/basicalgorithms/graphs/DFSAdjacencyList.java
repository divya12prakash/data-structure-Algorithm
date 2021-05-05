package com.dp.basicalgorithms.graphs;

import java.util.LinkedList;
import java.util.Iterator;

public class DFSAdjacencyList {

    private int vertices;

    private LinkedList[] adjacency;


    DFSAdjacencyList(int size){
        adjacency = new LinkedList[size];
        for(int i =0; i<size; i++){
            adjacency[i] = new LinkedList();
        }
    }


    private void DFSUtil(int index, boolean[] visited){
        visited[index] = true;

        Iterator<Integer> list = adjacency[index].listIterator();

        while(list.hasNext()){
            int n = list.next();
            if(!visited[n]){
                DFSUtil(n,visited);
            }
        }
    }


    private void DFS(int index){
        boolean[] visited = new boolean[vertices];

        DFSUtil(index,visited);
    }
}
