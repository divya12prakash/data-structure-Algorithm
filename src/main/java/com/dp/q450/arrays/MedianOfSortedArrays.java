package com.dp.q450.arrays;

/**
 * The steps are
 * 1. find the partitions for x and y arrays
 * 2. find the values for left and right of partitions in both the arrays
 * 3. Then find the medians based on length and the maximum and minimum values
 *
 * https://www.youtube.com/watch?v=lLFDQCDzfpI
 */
public class MedianOfSortedArrays {

    public double findMedian (int[] nums1, int[] nums2) {

        // Take smaller array in X so that we traverse less

        if(nums1.length > nums2.length) {
            int temp[] = nums1;
            nums1 = nums2;
            nums2 = temp;
        }


        //initiate the binary search procedure
        int low = 0;
        int high = nums1.length;
        int combinedLength = (nums1.length + nums2.length);

        while (low <= high) {
            //declare the partitions
            int partX = (low + high) / 2;
            int partY = (combinedLength + 1) / 2 - partX;

            //find the values to the left and right of partition in both the arrays.
            //We find the max value for the left of partition and min value to the right of partitions

            int leftX = getMax(nums1, partX);
            int rightX = getMin(nums1, partX);


            int leftY = getMax(nums2, partY);
            int rightY = getMin(nums2, partY);


            if(leftX < rightY && rightX > rightY) {
                if(combinedLength % 2 == 0) return (Math.max(leftX, leftY) + Math.min(rightX, rightY) ) / 2.0;
                else return Math.max(leftX, leftY);
            }


            if(leftX > rightY) high = partX - 1;
            else low = partX + 1;
        }

        return -1;
    }



    private int getMin(int[] nums, int partX) {
        if(partX == nums.length) return (int) Double.POSITIVE_INFINITY;
        return nums[partX];

    }

    private int getMax(int[] nums, int partX) {
        if(partX == 0) return (int) Double.NEGATIVE_INFINITY;
        return nums[partX - 1];

    }
}
