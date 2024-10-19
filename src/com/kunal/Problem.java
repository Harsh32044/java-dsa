package com.kunal;

public class Problem {

    public static void main(String[] args) {

        int[] arr = {3,5,2,4,6,4,2};
    }

    static int waterCollected(int[] arr, int n) {
        int result = 0;
        // Bounded areas
        // Absolute difference between alternate elements > 0
        // && mid element < either => valid area
        // min(abs(4-2), abs(5-2)) = 2
        int p1 = 0, p2 = 2;
        for (int i = 0; i < n; i++) {
//            if (arr[p2] == arr[p1]) {
//                continue;
//            }
            int absdiff = Math.abs(arr[p2] - arr[p1]);
            if (absdiff > 0) {

            }


        }
        return result;

    }
}
