package StriverA2Z.BasicMath;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
    static String armstrong(int a){
        if(a<1)
            return "Yes";
        int digits =(int) Math.log10(a)+1; // No of digits, cool formula
        int sum = 0, temp = a;
        for(int i = 0; i<digits; i++){
            int digit = temp % 10;
            sum += Math.pow(digit,digits);
            temp = temp / 10;
        }
        return sum == a ? "Yes" : "No";
    }
}
