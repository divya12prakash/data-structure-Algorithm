package com.dp.q450.arrays;

public class MaxMinOfArray {

    public static class Pair {
        private int max;
        private int min;

        public Pair(int max, int min) {
            this.max = max;
            this.min = min;
        }

        public Pair() {

        }

        ;

        @Override
        public String toString() {
            return "Pair{" +
                    "max=" + max +
                    ", min=" + min +
                    '}';
        }
    }

    public Pair max_min_brute_force(int[] input) {
        Pair pair = new Pair();

        if (input.length == 0) return null;
        if (input.length == 1) return new Pair(input[0], input[0]);
        if (input.length == 2) return new Pair(input[0] > input[1] ? input[0] : input[1],
                input[1] > input[0] ? input[1] : input[0]);

        if (input[0] > input[1]) {
            pair.max = input[0];
            pair.min = input[1];
        } else {
            pair.max = input[1];
            pair.min = input[0];
        }

        for (int i = 2; i < input.length; i++) {
            if (input[i] > pair.max) {
                pair.max = input[i];
            } else if (input[i] < pair.min) {
                pair.min = input[i];
            }

        }
        return pair;
    }


    public Pair max_min_groupCompare(int[] input) {
        if (input.length == 0) return null;
        if (input.length == 1) return new Pair(input[0], input[0]);

        Pair pair = new Pair();


        if (input.length % 2 == 0) {
            pair.max = input[0] > input[1] ? input[0] : input[1];
            pair.min = input[0] > input[1] ? input[1] : input[0];
        } else {
            pair.min = input[0];
            pair.max = input[0];
        }
        for (int i = 2; i < input.length - 1; i++) {

            if (input[i] > input[i + 1]) {
                if (input[i] > pair.max) pair.max = input[i];
                if (input[i + 1] < pair.min) pair.min = input[i + 1];
            } else {
                if (input[i + 1] > pair.max) pair.max = input[i + 1];
                if (input[i] < pair.min) pair.min = input[i];
            }
        }
        return pair;
    }
}


