package StriverA2Z.Recursion;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fib2(5)));

    }
    public static long[] printFibb(int n){
        //returns an array of Fibonacci numbers upto n
        //recursive solution
        long[] nums = new long[n];
        int i = 0;
        while(fib(i) < n){
            nums[i] = fib(i+1);
            i++;
        }
        return nums;
    }

    public static int fib(int n){
        if (n == 1 || n == 2)
            return 1;
        if(n == 0)
            return 0;
        return fib(n-1) + fib(n-2);
    }

    public static long[] fib2(int n){
        long[] nums = new long[n];
        for(int i = 1;i <= n; i++){
            if(i <= 2)
                nums[i-1] = 1;
            else{
                long temp = nums[(i-1)-1] + nums[(i-1)-2];
                if(temp <= n)
                    nums[i-1] = temp;
                else
                    break;
            }
        }
        return nums;
    }
}
