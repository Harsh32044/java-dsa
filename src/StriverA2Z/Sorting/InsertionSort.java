package StriverA2Z.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,6,-3,100,23};
        int[] arr2 = {5,4,3,2,1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

        insertionSortRec(arr2,0);
        System.out.println(Arrays.toString(arr2));
    }

    static void insertSort(int[] arr){
        for(int i = 0; i <= arr.length-2; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

    static void insertionSortRec(int[] arr, int i){
        if(i == arr.length-2){
            return;
        }
        for(int j = i+1; j>0; j--){
            if(arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] =temp;
            }
        }
        insertionSortRec(arr,i+1);
    }
}
