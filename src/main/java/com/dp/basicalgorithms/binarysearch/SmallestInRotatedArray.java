package com.dp.basicalgorithms.binarysearch;

public class SmallestInRotatedArray {


    public int findSmallestIndex(int[] arr) {

        int beg = 0;
        int end = arr.length - 1;
        int mid = beg + (end - beg) / 2;
        int center = arr[mid];

        int pos = 0;


        if (arr[0] <= arr[end]) {
            return pos;
        }

        // Check if the left half is sorted. If sorted, find the first smaller number on the right
        if (arr[0] < center) {
            beg = mid;
            while (beg <= end) {
                mid = beg + (end - beg) / 2;
                if (arr[mid] < center) {
                    pos = mid;
                    end = mid - 1;
                } else {
                    beg = mid + 1;
                }
            }
            return pos; // 'pos' is the position of the smallest number in the array.
        }
        // Right half is sorted. Find the last bigger number on the left
        else {
            end = mid;
            while (beg <= end) {
                mid = beg + (end - beg) / 2;
                if (arr[mid] > center) {
                    pos = mid;
                    beg = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
             /* 'pos' is the position of the last bigger number in the left half of the array.
                 So pos+1 is the position of the smallest number in the array. */
            pos += 1;
            return pos;
        }

    }


}
