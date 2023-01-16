package StriverA2Z.Arrays.Easy;

import java.util.Arrays;

public class LeftRotateArrayBy1 {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6};
//        leftRotateArray1(ar);
//        leftRotateArrayByK(ar,6,13);
        rightRotateArrayByK(ar,6,2);
        System.out.println(Arrays.toString(ar));
    }

    static void leftRotateArray1(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    static void leftRotateArrayByK(int[] arr,int N, int k){
        if(k > N){
            k = k % N;
        }
        if(k == 0)
            return;
        int[] temp = new int[k];

        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }

        for(int i = 0; i < N-k; i++){
            arr[i] = arr[i+k];
        }
        int j = 0;
        for(int i = N-k; i< N; i++){
            arr[i] = temp[j];
            j++;
        }
    }

    static void rightRotateArrayByK(int[] arr,int N, int k){
        if(k > N){
            k = k % N;
        }
        if(k == 0)
            return;
        int[] temp = new int[k];
        int[] copy = new int[arr.length];
        System.arraycopy(arr,0,copy,0,arr.length);
        int c = 0;
        for(int i = N-k; i < N; i++){
            temp[c] = arr[i];
            c++;
        }

        for(int i = 0; i < N-k; i++){
            arr[i+k] = copy[i];
        }
        int j = 0;
        for(int i = 0; i< k; i++){
            arr[i] = temp[j];
            j++;
        }
    }
}
