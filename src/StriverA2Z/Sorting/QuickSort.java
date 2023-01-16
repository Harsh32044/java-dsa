package StriverA2Z.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,3,-1,-9,-10};

        quickSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //in -place sort
    static void quickSort(int[] arr, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int s = lo;
        int e = hi;

        int mid = s + (e-s)/2; // mid

        int pivot = arr[mid];

        while(s<=e) {

            //also a reason why if its already sorted it worn't swap
            while (arr[s] < pivot) {
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            //swap strt and end
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;e--;
            }

        }

        //now my pivot is at corrct index, pls sort the two halves
        quickSort(arr, lo, e);
        quickSort(arr, s, hi);

    }
}
