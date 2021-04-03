package com.dp.basicalgorithms;

import java.util.*;

public class Dijkstras {

    int vertex;
    int[] distance;
    Set<Integer> visited;
    PriorityQueue<Dijnode> priorityQueue;
    List<Dijnode> adj_list;


    Dijkstras(int vertex){
        this.vertex = vertex;
        distance = new int[vertex];
        visited = new HashSet<Integer>(vertex);
        priorityQueue = new PriorityQueue<>(vertex);
    }


    public void dij_algo(int start_vertex, List<Dijnode> adj_list){

        this.adj_list = adj_list;

        for(int i=0; i<vertex; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        priorityQueue.add(new Dijnode(start_vertex,0));

        distance[start_vertex] = 0;

        while(visited.size() != vertex){
            int value = priorityQueue.remove().value;

            visited.add(value);

            graph_adj_nodes(value);
        }




    }

    private void graph_adj_nodes(int value) {

        List<Dijnode> neigh = (List<Dijnode>) adj_list.get(value);


        for (int i =0; i<neigh.size(); i++){
            Dijnode node  = neigh.get(i);

            if(!visited.contains(node)){
                int edgeDistance = node.cost;
                int newDist = edgeDistance + distance[value];

                if(newDist < distance[node.value]){
                    distance[node.value] = newDist;
                }
                priorityQueue.add((new Dijnode(node.value, distance[node.value])));
            }
        }

    }

}

class Dijnode implements Comparator<Dijnode> {
    int value;
    int cost;

    Dijnode(int value, int cost){
        this.value = value;
        this.cost = cost;
    }

    @Override
    public int compare(Dijnode o1, Dijnode o2) {
        if(o1.cost > o2.cost){
            return 1;
        }

        if(o1.cost < o2.cost){
            return -1;
        }
        return 0;
    }
}
