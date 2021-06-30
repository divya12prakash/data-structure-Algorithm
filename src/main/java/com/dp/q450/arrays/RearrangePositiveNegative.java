package com.dp.q450.arrays;

public class RearrangePositiveNegative {

    public int[] rearrange(int[] input) {

        int wrongIndex = -1;

        for(int i=0; i< input.length; i++) {
            if(wrongIndex != -1) {

                if((input[i] >=0 && input[wrongIndex]<0)
                || (input[i] < 0 && input[wrongIndex] >=0)) {
                    rightRotate(input, input.length, wrongIndex, i);
                    if(i - wrongIndex >=2) wrongIndex = wrongIndex + 2;
                    else wrongIndex = -1;
                }


            } else{
                if( (i % 2 == 0 && input[i] >= 0) || (i%2 == 1 && input[i] < 0) ){
                    wrongIndex = i;
                }
            }
        }

        return input;
    }

    private void rightRotate(int[] input, int length, int wrongIndex, int curr) {

        int temp = input[curr];
        for(int i=curr; i > wrongIndex; i--) {
            input[i] = input[i-1];
        }
        input[wrongIndex] = temp;
    }
}
