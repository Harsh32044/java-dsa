package StriverA2Z.Arrays.Easy;

import java.util.*;
import java.util.stream.Stream;

public class RemoveDupsInPlace {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1,3,4, 5, 6, 12, 13,17,19,22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63, 65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100};
        int k = removeDuplicates3(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("No of Distinct Elements: "+k);
    }

    static int removeDuplicatesWithHashSet(int[] arr) {
        HashSet < Integer > set = new HashSet < > ();//HashSet doesn't store duplicates
        for (int value : arr) {
            set.add(value);
        }
        Stream<Integer> sortedSet = set.stream().sorted();
        Object[] sortedSetArray = sortedSet.toArray();
        int k = set.size();
        int j = 0;

        for (Object o : sortedSetArray) {
            arr[j] = (int) o;
            j++;
        }
        return k;
    }

    static int removeDuplicates3 (int[] arr){
        int i = 0;

       for(int j = 1; j<arr.length; j++){
           if(arr[j] != arr[i]){
               //if array has increasing elements, i and j will always be adjacent to each other, so that i++ will mean i = j
               //where we have duplicates, the difference between i and j increases, so then the next time arr[i] != arr[j], i++ will not equal j
               i++;
               arr[i] = arr[j];

           }
       }
       return i+1;
    }
}
