package StriverSDESheet.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormInteger {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        int[] num = {9,9,9,9,9,9,9,9,9,9,3};
        int k = 1;

        int floorVal = num.length % 2 == 0 ? num.length / 2 : (num.length / 2) + 1;

//        System.out.println(addToArrayForm(num,k) + " " +addToArrayForm(num,k).size());

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int currentK = k;
        int n = num.length;
        for (int i = n; --i >= 0 || currentK > 0;) {
            if (i >= 0) {
                currentK += num[i];
            }
            res.add(currentK % 10);
            currentK /= 10;
        }
        Collections.reverse(res);
        return res;
    }

    /*1 <= num.length <= 104
            0 <= num[i] <= 9
    num does not contain any leading zeros except for the zero itself.
1 <= k <= 104*/
}
