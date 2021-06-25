package com.dp.q450.arrays;

public class CountInversion {

    public int bruteForce(int[] input) {
        int count = 0;

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) count++;
            }
        }
        return count;
    }


    /**
     * In merge sort method, we use the idea of merge sort
     * where every time, we try to merge and there is a shuffle,
     * we know there would be an inversion since the numbers
     * were not sorted in the right order
     */
    public int mergeSortMethod(int[] input, int[] aux_array, int low, int high) {
        int inversionCount = 0;
        int mid = 0;

        if (low < high) {
            mid = (high + low) / 2;

            inversionCount = mergeSortMethod(input, aux_array, low, mid);
            inversionCount += mergeSortMethod(input, aux_array,mid + 1, high);
            inversionCount += merge(input, aux_array,low, mid+1, high);

        }

        return inversionCount;
    }

    private int merge(int[] input, int aux_array[],int left, int mid, int right) {

        int swaps=0;

        int leftIndex = left;
        int rightIndex = mid;
        int auxIndex = left;
        aux_array = new int[input.length];

        while (leftIndex <= mid - 1 && rightIndex <= right) {
            if (input[leftIndex] <= input[rightIndex]) {
                aux_array[auxIndex++] = input[leftIndex++];
            } else {
                aux_array[auxIndex++] = input[rightIndex++];
                swaps += mid - leftIndex;
            }
        }

        if (leftIndex <= mid - 1) {
            for (int i = leftIndex; i <= mid - 1; i++) {
                aux_array[auxIndex++] = input[i];
            }
        } else {
            for (int j = rightIndex; j <= right; j++) {
                aux_array[auxIndex++] = input[j++];
            }
        }

        for(int i=left; i<=right; i++){
            input[i] = aux_array[i];
        }

        return swaps;
    }
}
