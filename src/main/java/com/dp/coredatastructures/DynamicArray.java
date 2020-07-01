package com.dp.coredatastructures;

/**
 * This is a Dynamic Array implementation from static array. It is more like an
 * array list from Java Collections.
 * The methods to be implemented are
 * 1. Create a new Dynamic array with a default or given size
 * 2. Find an element from the list
 * 3. Delete an element from the list
 * 4. Update an element in the list
 */
public class DynamicArray<T> {

    /**
     * Initial default capacity
     */
    private static final int INITIAL_DEFAULT_SIZE = 10;

    transient Object[] elementData; // non-private to simplify nested class access

    /**
     * Create an array list with given capacity
     * @return
     */
    public Object[] DynamicArray(int capacity){
        return new Object[capacity];
    }

    /**
     * Default sized array list creation
     * @return
     */
    public Object[] DynamicArray(){
        return new Object[INITIAL_DEFAULT_SIZE];
    }

    /**
     * Get the element of the array
     * @param index
     * @return
     */
    public Object get(int index){
        return (T) this.elementData[index];
    }

    /**
     * gets the index of an element in Dynamic List
     * @param object
     * @return
     */
    public int getIndexOf(Object object){
        Object[] es = this.elementData;
        
        for(int i=0; i<this.elementData.length; i++){
            if(object.equals( this.elementData[i])){
                return i;
            }
        }
        return -1;
    }

    /**
     * This adds an element into the dynamic array
     */
    public boolean add(Object object){
        //check the capacity of the array and ensure the capacity.
        //if capacity is going out of bound, create a new array and copy all the elements
        //of existing array to the new copy created.
        int length  = this.elementData.length;
        Object[] newElementArray=null;
        
        for(int i=0; i<this.elementData.length; i++) {
            if (this.elementData[i] == null) {
                this.elementData[i] = object;
                return true;
            } else {
                newElementArray = new Object[this.elementData.length * 2];
                newElementArray[i] = this.elementData[i];
            }
        }
            newElementArray[this.elementData.length+1] = object;
        return true;
    }

    /**
     * Clears the dynamic array 
     */
    public void clear(){
        for(int i=0; i<this.elementData.length; i++){
            this.elementData[i]= null;
        }
    }
}
