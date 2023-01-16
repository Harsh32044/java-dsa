package StriverA2Z.Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(reverse(nums)));
        System.out.println(Arrays.toString(reverseRecursive(nums,0)));
    }

    static int[] reverse(int[] nums){
        int length = nums.length;
        for(int i = 0; i < length/2; i++){
            int temp = nums[i];
            nums[i] = nums[length - i - 1];
            nums[length - i -1] = temp;
        }
        return nums;
    }
    //recursive approach

    static int[] reverseRecursive(int[] nums, int i) {
        //base case, if i = middle element
        int len = nums.length;
        if(len % 2 == 0)
        {
            if (i == (len/2) - 1){
                int temp = nums[i];
                nums[i] =  nums[i + 1];
                nums[i + 1] = temp;
                return nums;
            }
        }
        else{
            if(i == len/2){
                return nums;
            }
        }
        int temp = nums[i];
        nums[i] = nums[len - i - 1];
        nums[len - i - 1] = temp;

        return reverseRecursive(nums, i+1);
    }
}
