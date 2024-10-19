package com.kunal;

import java.util.Arrays;

public class ProblemSet {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        removeDups(arr);
//        System.out.println(Arrays.toString(arr));

        int[] nums = {4,5,2,25};

        System.out.println(Arrays.toString(nextGreater(nums)));
    }
/*
    Remove duplicates from a sorted array

    I/P: 1 1 2 2 3 3
    O/P: 1 2 3*/

    static void removeDups(int[] arr) {
        int temp = 1; // This will be at the place where modification would be done
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[temp] = arr[i];
                temp++;
            }
        }

        for (int j = temp; j < arr.length; j++) {
            arr[j] = 0;
        }
    }

/*    The Next greater Element for an element x is the first greater element on the right side of x in the array.
      Elements for which no greater element exist, consider the next greater element as -1.

    Input: arr[] = [ 4 , 5 , 2 , 25 ]
    Output: arr[] = [5 25 25 -1]
    Explanation: 4 –> 5, 5  –> 25, 2  –> 25, 25–> -1*/

    static int[] nextGreater(int[] arr) {
        int[] res = new int[arr.length];
        int nextG = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                nextG = arr[i];
                res[i] = -1;
            } else {
                // If current element > prev, then nextG = current
                if (arr[i] < arr[i + 1]) {
                    nextG = arr[i+1];
                } else {
                    nextG = Math.max(arr[i], nextG);
                }
                res[i] = nextG;
            }
        }
        return res;
    }
}
