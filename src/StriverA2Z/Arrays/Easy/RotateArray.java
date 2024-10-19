package StriverA2Z.Arrays.Easy;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int eff = k % n;
        if (eff == 0) {
            return;
        }
        int[] res = new int[n];

        int i = n - eff, j = 0;
        for (int l = 0; l < n; l++) {
            if (i < n) {
                res[l] = nums[i];
                i++;
            }
            else if (j < n-eff) {
                res[l] = nums[j];
                j++;
            }
        }
        System.arraycopy(res,0,nums,0, n);
        System.out.println(Arrays.toString(res));
    }
}
