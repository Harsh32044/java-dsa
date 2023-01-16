package StriverA2Z.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {91,23,72,34,6};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr2 = {5,4,3,2,1};
        bubbleSortRecursive(arr2,arr2.length-1);
        System.out.println(Arrays.toString(arr2));

    }

    static void bubbleSortRecursive(int[] arr, int i){
        if(i == 0) {
            return;
        }
        for(int j = 0; j<i; j++){
            if(arr[j] > arr[j+1])
                swap(arr, j, j+1);
        }
        bubbleSortRecursive(arr,i-1);
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubbleSort(int[] arr){
        for(int i = arr.length-1; i >= 1;i--){
            boolean swapped = false;
            for(int j = 0; j<i; j++){
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }

    }


}
