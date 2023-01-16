package StriverA2Z.Recursion;

import java.util.ArrayList;

import static StriverA2Z.Recursion.Solution.factorial;

public class ListOfFactorials {

    public static void main(String[] args) {
        System.out.println(getFactorialsUptoN(4596349));
    }
    static ArrayList<Long> getFactorialsUptoN(long N){
        ArrayList<Long> result = new ArrayList<>();
        long fact = 1l;
        int x = 2;
        while(fact <= N){
                result.add(fact);

                fact = fact * x;
                x++;
            }
        return result;
        //simple and genius solution
        
    }

    static boolean factorialCheck(long num){
        //Good One
        if(num < 0)
            return false;
        if(num <2)
            return true;
        int fact = 1;
        for(int i = 2; i < num; i++){
            fact = fact * i;
            if(num == fact) {
                return true;
            }
        }
        return false;
    }
}
