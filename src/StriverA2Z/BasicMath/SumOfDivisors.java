package StriverA2Z.BasicMath;

public class SumOfDivisors {
    public static void main(String[] args) {
//        System.out.println(getSumOfDivisors(100));

        System.out.println(checkForPrime(578495839));
        System.out.println(checkForPrimeCrude(578495839));

    }
    static long getSumOfDivisors(int num){
        long sum = 0;
        //all divisors are natural numbers less than or eq tp num
        for(int i = 1; i<= (int) Math.sqrt(num);i++){
            if(num % i == 0 ){
                sum += i;
                if(i != num / i){
                    sum += num/i;
                }
            }
        }
        return sum;
    }

    static boolean checkForPrime(int n){
        if (n > 1 && n <=3)
            return true;
        int factors = 0;
        for(int i = 1; i <= (int) Math.sqrt(n); i++){
            if(n % i == 0)
                factors++;
        }
        return !(factors > 1);
    }

    static boolean checkForPrimeCrude(int n){
        for(int i = 1; i <= n; i++){
            if( i > 1 && i < n && n % i == 0)
                return false;
        }
        return true;
    }
}
