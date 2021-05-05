package com.dp.basicalgorithms.graphs;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 1. Get the structure created
 * 2. Visit first node and push it on stack and mark the node visited
 * 3. Find all adjacent neighbours and push them on stack too
 * 4. Traverse through
 */

public class DFSStack {

    public void search(Node node){
        Stack<Node> integerStack = new Stack();
        integerStack.push(node);

        while(!integerStack.isEmpty()){
            Node n = integerStack.pop();
            n.visited = true;

            List<Node> adj = n.adjecents;

            for(Node node1: adj){
                if(node1 !=null && !node1.isVisited()){
                    integerStack.push(node1);
                    node1.visited = true;
                }
            }
        }
    }

}


class Node<E>{
    int value;
    boolean visited;
    List<Node> adjecents;


    Node(int value){
        this.value = value;
        adjecents = new ArrayList();
    }

    public void addAdjecents(Node n){
        this.adjecents.add(n);
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }
}