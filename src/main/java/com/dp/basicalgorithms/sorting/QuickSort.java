package com.dp.basicalgorithms.sorting;

public class QuickSort {


    public void quickSor(int[] array, int start, int end) {

        if (start < end) {

            int p = sort(array, start, end);

            quickSor(array, start, p - 1);
            quickSor(array, p + 1, end);

        }

    }

    private int sort(int[] array, int start, int end) {

        int pivot = array[end];
        int j = start;

        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }

        int tmp = array[j];
        array[j] = array[end];
        array[end] = tmp;

        return j;
    }
}
