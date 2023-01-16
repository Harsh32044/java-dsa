package StriverA2Z.Sorting;

import java.util.Arrays;

public class QuickSortRough {
    public static void main(String[] args) {
        int[] arr = {5,3,-1,-9,-10};

        quickSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int arr[], int low, int high)
    {
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int pivot = partition(arr, s, e);

        while(low <= high) {

            while(arr[s] < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                e--;
                s++;
            }
        }

        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
    static int partition(int arr[], int low, int high)
    {

        int mid = low + (high-low)/2; // mid

        int pivot = arr[mid];

        return pivot;
    }
}
