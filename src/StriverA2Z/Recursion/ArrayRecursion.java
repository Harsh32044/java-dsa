package StriverA2Z.Recursion;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,88,90,1000,9999};
//        System.out.println(isSorted(arr));
        System.out.println(isSortedRecursive(arr,0));
    }
    static boolean isSorted(int[] arr){
        if(arr.length == 1)
            return true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }

    static boolean isSortedRecursive(int[] arr, int i){
        if(i == arr.length-1)
            return true;
        return (arr[i] < arr[i+1] && isSortedRecursive(arr,i+1));
    }
}
