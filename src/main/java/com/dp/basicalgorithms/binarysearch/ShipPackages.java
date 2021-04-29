package com.dp.basicalgorithms.binarysearch;

public class ShipPackages {


    public int ship(int[] weights , int days){

        int answer = 0;
        int low = 0;
        int high = Integer.MAX_VALUE;

        while (low <= high) {
            int maxWeight = low + (high -low)/2;
            if(canShip(weights, maxWeight, days)){
                answer = maxWeight;
                high  = maxWeight  - 1;
            } else low = maxWeight + 1;
        }

        return answer;
    }


    /**
     * Method tp check if the condition is satisfied
     * @param weights
     * @param maxWeight
     * @param days
     * @return
     */
    private boolean canShip(int[] weights, int maxWeight, int days) {

        int currentWeight = 0;
        int day = 1;

        for(int w : weights) {
            currentWeight += w;

            if (currentWeight > maxWeight) {

                int nextDayWeight = w;

                if (nextDayWeight > maxWeight) return false;

                currentWeight = nextDayWeight;
                day++;
            }

        }

        if(day <= days) return true;
        return false;
    }


}
