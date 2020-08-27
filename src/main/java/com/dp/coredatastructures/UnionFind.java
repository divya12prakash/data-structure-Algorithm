package com.dp.coredatastructures;

public class UnionFind<T> {
    
    //Total size of the union find
    private int size;
    
    //to track size of each compoment
    private int[] sz;
    
    //id[i] will point to parent of each element in the union find
    private int[] id;
    
    //Constructor for Union find
    public UnionFind(int num){
        size = num;
        sz = new int[num];
        id = new int[num];
        
        for(int i=0; i<num; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }
    
    //Find the id(Family/root node) of element where p belongs
    public int find(int p){
        
        int root = p;
        while(id[root] != root)
        {
            root = id[root];
        }
        
        while(root != id[p]){
            int next = id[p];
            id[p] = root;
            p = next;
        }
        
        return root;
    }

    // Return whether or not the elements 'p' and
    // 'q' are in the same components/set.
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    
    //Unify two trees
    public void unify(int a, int b){
        int root1 = id[a];
        int root2 = id[b];
        
        if(connected(root1,root2) ) return;
        
        if(sz[root1]> sz[root2]){
            sz[root1] += sz[root2];
            id[root2] = root1;
        }else{
            sz[root2] += sz[root1];
            id[root1] = root2;
        }
        
    }
    
}
