package StriverA2Z.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] arr = {1,5,3,9,2};
        for(int i = arr.length-1; i >= 0;i--){
            int max = Integer.MIN_VALUE, maxInd = 0;
            for(int j = 0; j <= i; j++){
                if (arr[j] > max) {
                    max = arr[j];
                    maxInd = j;
                }
            }
            int tmp = arr[i];
            arr[i] = max;
            arr[maxInd] = tmp;

        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(selectionSortRecursive(arr,arr.length-1)));
    }

    static int[] selectionSortRecursive(int[] arr,int end){
        if(end == arr[0])
            return arr;
        int max = Integer.MIN_VALUE, maxInd = 0;
        for(int j = 0; j <= end; j++){
            if (arr[j] > max) {
                max = arr[j];
                maxInd = j;
            }
        }
        int tmp = arr[end];
        arr[end] = max;
        arr[maxInd] = tmp;

        return selectionSortRecursive(arr,end-1);
    }
}
