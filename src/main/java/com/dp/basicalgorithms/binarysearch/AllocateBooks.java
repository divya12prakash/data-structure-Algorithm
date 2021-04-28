package com.dp.basicalgorithms.binarysearch;

public class AllocateBooks {



    public int distributeBooks(int[] books, int students) {

        if(books.length < students) return -1;

        int high = Integer.MAX_VALUE;
        int low = 0;
        int max_pages = 0;

        while (low <=high){
            int maxPages = low + (high - low)/2;

            if(canAllocate(books, maxPages, students)){
                max_pages = maxPages;
                high = maxPages -1;
            } else low = maxPages + 1;

        }

        return max_pages;
    }

    private boolean canAllocate(int[] books, int maxPages, int students) {

        int no_students = 1;
        int allocation = 0;

        for (int pages:books) {
            if(allocation <= maxPages){
                allocation += pages;

                if(allocation > maxPages){
                    int nextStudAll = pages;

                    if(nextStudAll > maxPages){
                        return false;
                    }
                    no_students++;
                    allocation = nextStudAll;
                }
            }

        }

        if(no_students <=students) return true;

        return false;



    }


}
