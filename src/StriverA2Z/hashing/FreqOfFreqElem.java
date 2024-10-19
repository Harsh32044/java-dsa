package StriverA2Z.hashing;

import java.util.Arrays;

public class FreqOfFreqElem {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,4};
        System.out.println(maxFreq(arr, 2));


    }

    private static int maxFreq(int[] arr, int k) {

        Arrays.sort(arr);

        int l = 0, r = 0, res = 0, total = 0;

        while (r < arr.length) {
            total += arr[r];

            while (arr[r] * (r-l+1) > total + k) {
                total -= arr[l];
                l++;
            }
            res = Math.max(res, r-l+1);
            r++;
        }

        return res;
    }
}
