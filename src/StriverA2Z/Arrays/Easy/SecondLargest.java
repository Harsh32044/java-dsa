package StriverA2Z.Arrays.Easy;

import jdk.jfr.Name;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,-3,34,98,2};
//        System.out.println(secondLargest(arr));

//        System.out.println(Arrays.toString(secMaxandMin(arr)));

        System.out.println(Arrays.toString(secMaxAndMinBest(arr)));

    }

    //Trivial solutiom, using a version of Bubble sort
    static int secondLargest(int[] arr){
        for(int i = arr.length-2; i>=arr.length-3;i--){
            for(int j = 0; j<=i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }

    // Better Solution
    static int[] secMaxandMin(int[] arr){

        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        //finding the max and min elements
        for(int i = 0; i < arr.length; i++){
            small = Math.min(arr[i],small);
            max = Math.max(arr[i],max);
        }

        /// finding the second max and min elements
        for(int j = 0; j< arr.length; j++){
            if(arr[j] < sec_small && arr[j] != small)
                sec_small = arr[j];

            if(arr[j] > sec_max && arr[j] != max)
                sec_max = arr[j];
        }

        sec_max = (sec_max == Integer.MIN_VALUE)? -1 : sec_max;
        sec_small = (sec_small == Integer.MAX_VALUE)? -1 : sec_small;

        return new int[]{sec_small,sec_max};
    }

    //Best Solution
    static int[] secMaxAndMinBest(int[] arr) {
        int max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, sec_min = Integer.MAX_VALUE;

        //Idea is, if the current element is smaller than min, update both min and second min.
        // Else if current element is smaller than only second min, and its not equal to min
        // update only secpnd min
        for(int j = 0; j< arr.length; j++){
            if(arr[j] < min) {
                sec_min = min;
                min = arr[j];
            }
            else if(arr[j] < sec_min && arr[j] != min){
                sec_min = arr[j];
            }

            if(arr[j] > max) {
                sec_max = max;
                max = arr[j];
            }
            else if(arr[j] > sec_max && arr[j] != max){
                sec_max = arr[j];
            }
        }

        sec_max = (sec_max == Integer.MIN_VALUE)? -1 : sec_max;
        sec_min = (sec_min == Integer.MAX_VALUE)? -1 : sec_min;

        return new int[]{sec_min, sec_max};


    }



}
