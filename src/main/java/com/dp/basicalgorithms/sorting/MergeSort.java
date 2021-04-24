package com.dp.basicalgorithms.sorting;

public class MergeSort {

    int[] auxArray;


    public MergeSort(int size) {
        this.auxArray = new int[size];
    }

    public void mergeSor(int[] arr, int low, int high) {

        int mid = (low + high) / 2;

        if (low < high) {
            mergeSor(arr, low, mid);
            mergeSor(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private void merge(int[] arr, int low, int mid, int high) {

        int leftIndex = low;
        int rightIndex = mid + 1;
        int auxIndex = low;


        while (leftIndex <= mid && rightIndex <= high) {

            if (arr[leftIndex] <= arr[rightIndex]) {
                auxArray[auxIndex++] = arr[leftIndex++];
            } else auxArray[auxIndex++] = arr[rightIndex++];
        }

        if (leftIndex <= mid) {
            for (int i = leftIndex; i <= mid; i++) {
                auxArray[auxIndex++] = arr[i];
            }
        } else {
            for (int j = rightIndex; j <= high; j++) {
                auxArray[auxIndex++] = arr[j];
            }
        }

        for (int i=low; i<=high; i++){
            arr[i] = auxArray[i];
        }


    }
}
