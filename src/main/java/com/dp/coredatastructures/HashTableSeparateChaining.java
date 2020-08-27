package com.dp.coredatastructures;

import java.util.LinkedList;

public class HashTableSeparateChaining<K, V> {

    public static final int INITIAL_CAPACITY = 3;
    public static final float LOAD_FACTOR = 0.75F;
    LinkedList<Entry<K, V>>[] table;
    private float maxLoadFactor;
    int size,capacity,threshold = 0;
    
    public HashTableSeparateChaining() {
        this(INITIAL_CAPACITY, LOAD_FACTOR);
    }

    public HashTableSeparateChaining(int capacity) {
        this(capacity, LOAD_FACTOR);
    }

    public HashTableSeparateChaining(int initialCapacity, float maxLoadFactor) {
        this.maxLoadFactor = maxLoadFactor;
        this.capacity = Math.max(INITIAL_CAPACITY, initialCapacity);
        this.threshold = (int) (this.maxLoadFactor * this.capacity);
        table = new LinkedList[initialCapacity];
    }
    
    private int normalizeIndex(int keyHash){
        return (keyHash & 0x7FFFFFFF) % capacity;
    }
    
    public V put(K key, V value){
        return insert(key,value);
    }
    
    public V add(K k, V v){
        return insert(k,v);
    }

    private V insert(K key, V value) {
        int normalizedBucketIndex = normalizeIndex(key.hashCode());
        Entry<K, V> newEntry = new Entry(key, value);
        LinkedList<Entry<K, V>> existingList = table[normalizedBucketIndex];
        if (existingList == null) table[normalizedBucketIndex] = existingList = new LinkedList();
        Entry<K, V> existentEntry = bucketSeekEntry(normalizedBucketIndex, key);
        if (existentEntry == null) {
            existingList.add(newEntry);
            if (++size > threshold) resizeTable();
            return null;
        } else {
            V oldVal = existentEntry.value;
            existentEntry.value = newEntry.value;
            return oldVal;
        }
    }
    
    private void resizeTable(){
        capacity *=2;
        threshold = (int)(capacity * maxLoadFactor);
        
        LinkedList<Entry<K,V>>[] newTable = new LinkedList[capacity];
        
        for( int i=0; i< table.length; i++){
            if(table[i] != null){
                for(Entry<K,V> entry : table[i]){
                    int bucketIndex = normalizeIndex(entry.hash);
                    LinkedList<Entry<K, V>> bucket = newTable[bucketIndex];
                    if (bucket == null) newTable[bucketIndex] = bucket = new LinkedList<>();
                    bucket.add(entry);
                }
                table[i].clear();
                table[i] = null;
            }
        }
        table = newTable;
    }
    
    public boolean containsKey(K key){
        if(key ==null) return false;
        return hasKey(key);
    }
    
    private boolean hasKey(K key){
        int bucketIndex = normalizeIndex(key.hashCode());
        return bucketSeekEntry(bucketIndex,key) != null;
    }
    
    private Entry<K,V> bucketSeekEntry(int bucketIndex, K key){
        if(key == null) return null;
        LinkedList<Entry<K,V>> bucket = table[bucketIndex];
        if(bucket == null) return null;
        for(Entry<K,V> entry:bucket) if(entry.key.equals(key)) return entry;
        return null;
    }
    
    
    
}

class Entry<K, V> {
    int hash;
    K key;
    V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
        this.hash = value.hashCode();
    }
}