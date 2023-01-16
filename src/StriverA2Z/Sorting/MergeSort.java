package StriverA2Z.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {4,1,3,9,7};
        //int[] arr = mergeSort(nums);
       // System.out.println(Arrays.toString(arr));
        mergeSortInPlace(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1)
            return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1)
            return;
        int mid= (s+e)/2;
        mergeSortInPlace(arr,s,mid); // sorted first half of array, in place
        mergeSortInPlace(arr,mid,e); // sorted second half or array

        mergeInPlace(arr,s,mid,e); // merging both halves
    }

    static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] res = new int[e-s];

        int i = s, j = m, k = 0;

        while(i < m && j < e){
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

        while(i < m){
            res[k] = arr[i];
            i++;k++;
        }

        while(j < e){
            res[k] = arr[j];
            j++;
            k++;
        }

        for(int num = 0; num < res.length; num++){
            arr[s+num] = res[num];
        }
    }

    private static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];

        int i = 0,j = 0,k = 0;
        while(j < left.length && k < right.length) {
            if (left[j] < right[k]) {
                res[i] = left[j];
                j++;
            } else {
                res[i] = right[k];
                k++;
            }
            i++;
        }
        //might be possible that one of the arrays isn't yet completed while other one is
        //we will directly append the leftover portion of incompleted array into the end of result array
        while(j < left.length){
            res[i] = left[j];
            i++;
            j++;
        }
        while(k < right.length){
            res[i] = right[k];
            i++;
            k++;
        }
        return res;
    }
}
