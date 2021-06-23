package com.dp.q450.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {


    public int[] merge(int[] arr1, int[] arr2) {

        int[] output = new int[arr1.length + arr2.length];
        int firstPointer = arr1.length;
        int secondPointer = arr2.length;

        int i = 0, j = 0, k = 0;

        while (i < firstPointer && j < secondPointer) {
            output[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }

        while (i < firstPointer) {
            output[k++] = arr1[i++];
        }

        while (j < secondPointer) {
            output[k++] = arr2[j++];
        }

        return output;
    }

    /**
     * The assumption is the first array is of enough size to
     * accommodate the elements of the second array
     * First array is the larger array
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] mergeInTheSameArray(int[] arr1, int m, int[] arr2, int n) {
        int p1 = m - 1, p2 = n - 1, i = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && arr1[p1] > arr2[p2]) {
                arr1[i--] = arr1[p1--];
            } else arr1[i--] = arr2[p2--];
        }

        return arr1;

    }


    static int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
    static int arr2[] = new int[] { 2, 3, 8, 13 };

    // Function to merge two arrays
    static void merge(int m, int n)
    {

        int i= m-1, j=0;
        while(i>=0 && j<n){
            if(arr1[i] > arr2[j]){
                arr1[i] = arr1[i] ^ arr2[j] ^ (arr2[j++] = arr1[i--]);
            } else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args)
    {
        merge(arr1.length, arr2.length);
        System.out.print("After Merging \nFirst Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
    }
}
