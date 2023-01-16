package StriverA2Z.Arrays.Easy;

public class Rough {
    public static void main(String[] args) {
//        int[] arr = {1,-3,34,98,2};

        int[] arr = {12,12,12,12,12,12,12};

        System.out.println(secLargest(arr,arr.length));
    }

    static int secLargest(int[] arr, int n) {
        int max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;
        if (n < 2) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }

        /// finding the second max and min elements
        for (int j = 0; j < n; j++) {
            if (arr[j] > sec_max && arr[j] != max)
                sec_max = arr[j];
        }

        return (sec_max == max || sec_max == Integer.MIN_VALUE)? -1 : sec_max;
    }
}
