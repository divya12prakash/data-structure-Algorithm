package com.dp.q450.arrays;

public class KthElement {

    //need to create a min heap
    //create min for first k element and later compare in a loop

    static class MinHeap{
        private int[] heap;
        private int size;
        private int capacity;
        private int topElement;

        private int left(int i) { return ((2*i) + 1); }
        private int right(int i) { return ((2*i) + 2);}
        private int parent(int i) {return (i - 1)/2;}
        private int minValue() {return heap[0];}


        public MinHeap(int[] arr, int size){
            this.heap = arr;
            this.size = size;

            int i = (size - 1)/2;

            while (i >=0){
                minHeapify(i);
                i--;
            }
        }

        private void minHeapify(int i) {
            int left = left(i);
            int right = right(i);
            //we assume that the index passed is smallest to start and later change the value based on
            //our findings
            int smallestIndex = i;

            if(left < size && heap[left] < heap[i]) smallestIndex = left;
            if(right < size && heap[right] < heap[smallestIndex]) smallestIndex = right;

            if(smallestIndex != i){
                int temp = heap[i];
                heap[i] = heap[smallestIndex];
                heap[smallestIndex] = temp;
                minHeapify(smallestIndex);
            }
        }

        private int getMinValue(){
            if(size == 0) return Integer.MAX_VALUE;

            int root = heap[0];

            heap[0] = heap[size - 1];
            minHeapify(0);

            size--;
            return root;
        }
    }

    public int kthElement(int[] input, int k) {

        MinHeap minHeap = new MinHeap(input, input.length);

        for(int i=0; i< k - 1; i++){
            //remove the smallest elements, k-1 times and then extract the top element
            minHeap.getMinValue();
        }
        return minHeap.minValue();

    }


}
