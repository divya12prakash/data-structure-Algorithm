package com.dp.basicalgorithms;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/**
 * Implement Breadth first binarysearch using a queue data structure.
 */
public class BFSQueue {

    Queue<BFSNode> queue;

    void search(BFSNode initialNode) {

        queue.add(initialNode);
        initialNode.visited = Boolean.TRUE;

        while (!queue.isEmpty()){
            BFSNode bfsNode = queue.remove();

            List<BFSNode> neigh = (List<BFSNode>) bfsNode.neighbours.listIterator();

            for(BFSNode bfsNode1: neigh){
                if(!bfsNode1.visited && bfsNode1!=null) {
                    bfsNode1.visited = true;
                    queue.add(bfsNode1);
                }
            }
        }

    }


}

@Getter
@Setter
class BFSNode {
    int value;
    List<Integer> neighbours;
    boolean visited;

    BFSNode(int value) {
        this.value = value;
        this.neighbours = new ArrayList<>();
    }
}