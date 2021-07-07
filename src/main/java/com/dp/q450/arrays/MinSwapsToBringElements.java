package com.dp.q450.arrays;

public class MinSwapsToBringElements {

    /*
    We want to find the numbers of our interest and bring them up together
    1. We count the number of elements of our interest and then try the sliding window approach.
    2. Count the number of bad values in current window of size goodValue.
    2. We take the window size as the number of good elements. loop through the window to check
    the number of bad elements. We keep comparing this by sliding the window and take minimum
    of the the min variable.

     */

    public int minSwaps(int[] array, int number) {

        int goodElements = 0, minSwaps = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] <= number) goodElements++;
        }

        for (int index = 0; index < goodElements; index++) {
            if (array[index] > number) minSwaps++;
        }

        int i = 0, j = goodElements, answer = minSwaps;

        while (j < array.length) {

            if (array[i++] > number) minSwaps--;
            if (array[j++] > number) minSwaps++;

            answer = Math.min(answer, minSwaps);

        }

        return minSwaps;
    }
}
