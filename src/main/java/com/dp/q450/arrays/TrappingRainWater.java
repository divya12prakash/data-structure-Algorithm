package com.dp.q450.arrays;

public class TrappingRainWater {


    /**
     * the concept is to find the max to the left and max to the right
     * of a given index. Once we find these values, take the value that is minimum of these two
     * the resultant water would be the difference between the value and the arr[i]
     * Time complexity O(n2)
     */
    public int tappingWater(int[] arr) {

        int totalVolume = 0;


        for (int index = 1; index < arr.length - 1; index++) {

            int left = arr[index];

            for (int j = 0; j < index; j++) {
                if (arr[j] > left) left = arr[j];
            }

            int right = arr[index];

            for (int j = index + 1; j < arr.length; j++) {
                if (arr[j] > right) right = arr[j];
            }

            totalVolume += (Math.min(left, right) - arr[index]);

        }

        return totalVolume;


    }


    /**
     * Another solution to keep in mind is to precompute these mac values for all the elements
     * that way we would not be required to run two loops.
     * But it does require extra space since we need to have two arrays, one for maintaing values of
     * left and other for maintaining values at the right.
     *     // Fill left array
     *         left[0] = arr[0];
     *         for (int i = 1; i < n; i++)
     *             left[i] = Math.max(left[i - 1], arr[i]);
     *
     *         // Fill right array
     *         right[n - 1] = arr[n - 1];
     *         for (int i = n - 2; i >= 0; i--)
     *             right[i] = Math.max(right[i + 1], arr[i]);
     *
     *         // Calculate the accumulated water element by element
     *         // consider the amount of water on i'th bar, the
     *         // amount of water accumulated on this particular
     *         // bar will be equal to min(left[i], right[i]) - arr[i] .
     *         for (int i = 0; i < n; i++)
     *             water += Math.min(left[i], right[i]) - arr[i]
     */


    /**
     * O(n) solution. The concept is the same. Find the max elements on both side
     * and then take the minimum of those two.
     * Later perform subtraction with current element to find the amount
     * of water that can be trapped.
     */


    public int getTrappedWater(int[] array) {
        int low = 0;
        int high = array.length - 1;

        int max = 0, min = 0, answer = 0;

        while (low <= high) {
            //this if is for the left side. left side can trap water only if
            //the value is lower than the right side
            if (array[low] < array[high]) {
                //Now check the left side of this left element.
                //if the min element is lower then we cannot trap water at
                //this element
                if (array[low] > min) {
                    min = array[low];
                } else answer += min - array[low];
                low++;
            } else {
                //This else is for the right side values, again similar concept
                if (array[high] > max) {
                    max = array[high];
                } else answer += max - array[high];
                high--;

            }

        }

        return answer;
    }
}
