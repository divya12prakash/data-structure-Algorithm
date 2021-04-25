package com.dp.basicalgorithms.binarysearch;


/**
 * Given a sorted array, find the number of occurrence of a
 * particular number
 */
public class FindOccurrenceCount {

    public int findCount(int[] array, int num) {

        int first = findFirstOcc(array, num);
        int last = findLastOcc(array, num);

        return last - first + 1;
    }

    private int findLastOcc(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;
        int mid = low + (high - low) / 2;

        while (low < high) {
            if (array[mid] == num) {
                if (mid + 1 < array.length - 1 && array[mid + 1] == num) {
                    low = mid + 1;
                    continue;
                }
                return mid;
            } else if (array[mid] < num) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    private int findFirstOcc(int[] array, int num) {

        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == num) {
                if (mid - 1 >= 0 && array[mid - 1] == num) {
                    high = mid - 1;
                    continue;
                }
                return mid;

            } else if (array[mid] < num) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return -1;
    }


}
