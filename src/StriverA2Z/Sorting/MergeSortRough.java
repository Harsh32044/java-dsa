package StriverA2Z.Sorting;

import java.util.Arrays;

public class MergeSortRough {
    public static void main(String[] args) {
        int[] arr ={10,9,8,7,6,5,4,3,2,1};

        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void merge(int[] arr, int l, int m, int r)
    {
        int[] res = new int[r-l+1];

        int i = l, j = m+1, k = 0;

        while(i <= m && j <= r){
            if(arr[i] < arr[j]){
                res[k] = arr[i];
                i++;
            }
            else{
                res[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= m){
            res[k] = arr[i];
            i++;k++;
        }

        while(j <= r){
            res[k] = arr[j];
            j++;
            k++;
        }

        for(int num = 0; num < res.length; num++){
            arr[l+num] = res[num];
        }
    }
    static void mergeSort(int[] arr, int l, int r)
    {
        if(r > l) {
            int mid = (r + l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }
}
