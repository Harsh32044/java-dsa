package StriverSDESheet.Day1;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2,3,4,1};
        nextPermut(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void nextPermut(int[] nums){
        int i = nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]){//finding the index of first element such tht nums[i] < nums[i+1], and we will use i for simplicity, not i-1, looping from right
            i--;
        }
        if(i>=0) {//if i is less than zero, means we have the given array as largest possible permutation, so we'll reverse the whole array
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {//array is sorted in desc order to the right of nums[i]; looping from right, to find element just biggr than nums[i]
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums,i+1);
    }

    static void swap(int[] num,int a,int b){
        int tmp = num[a];
        num[a] =num[b];
        num[b]=tmp;
    }
    static void reverse(int[] num, int start){
        int i = start;
        int j = num.length-1;
        while(i < j){
            if(i < j){
                swap(num,i,j);
                i++;
                j--;
            }
        }
    }
}
