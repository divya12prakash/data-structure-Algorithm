package com.dp.coredatastructures;

import java.util.Arrays;

public class FenwickTree {
    
    private int n;
    
    private long[] tree;
    
    public FenwickTree(long[] values){
        if(values ==null) throw new IllegalArgumentException("Values cannot be null");
        n = values.length;
        values[0] = 0L;
        tree = values.clone();
        
        for(int i=1; i<n; i++){
            int l = lsb(i);
            int parent  = i + l;
            if (parent < n) tree[parent] += tree[i];
        }
    }

    private int lsb(int i) {
        return i & -i;
    }

    @Override
    public String toString() {
        return "FenwickTree{" +
                "tree=" + Arrays.toString(tree) +
                '}';
    }
}
