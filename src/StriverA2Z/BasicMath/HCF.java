package StriverA2Z.BasicMath;

public class HCF {
    public static void main(String[] args) {
        System.out.println(getHCFBetter(200,478));
    }
    //Naive approach
    static int getHCF(int a,int b){
        int end = Math.min(a,b);
        int hcf = 0;
        for (int i = 1; i <= end; i++) {
            if(a % i == 0 && b % i == 0){
                if(i > hcf)
                    hcf = i;
            }
        }
        return hcf;
    }

    //Long Division Method
    static int getHCFBetter(int a, int b){
        //Euclid's Theorem : HCF(a,b) = HCF(b, a%b)
        //Base Case HCF(a,0) = a;
        if(b == 0)
            return a;
        return getHCFBetter(b,a%b);
    }

//    static Long[] lcmAndGcd(Long A, Long B){
//        Long gcd = getHCFBetter(A,B);
//        Long lcm =  (A * B)/gcd;
//        Long[] res = new Long[2];
//        res[0] = lcm;
//        res[1] = gcd;
//        return res;
//    }
}
