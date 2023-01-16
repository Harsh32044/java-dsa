package StriverA2Z.Recursion;

public class Solution {
    public static void main(String[] args) {
        //printNtimes(5);

       // System.out.println(sumOfSeries(50000));

        System.out.println(factorial(20));
    }
    static void printNtimes(int N){
        if(N >= 1) {
            printNtimes(N-1);
            System.out.print("GFG"+ " ");
        }
    }

    static void printToN(int N){
        if (N >= 1) {

            System.out.println(N);
            printToN(N-1);
        }
    }

    static long sumOfSeries(long N) {
        if(N == 0 || N == 1)
            return N;
        return (int) (Math.pow(N,3)) + sumOfSeries(N-1);
    }

    public static long factorial(int N){
        if(N == 0 || N==1 || N==2)
            return N;
        return N * factorial(N-1);
    }

    public static long factorial(long N){
        if(N == 0 || N==1 || N==2)
            return N;
        return N * factorial(N-1);
    }
}
