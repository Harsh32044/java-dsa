package StriverA2Z;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = {10,2,10,23,4,4,2,10};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i],1);
            var y = 9;

        }
//        for(Map.Entry<Integer, Integer> set : map.entrySet()){
//            System.out.println(set.getKey());
//        }
        System.out.println(map);

        //finding the mode and anti-mode (highest freq and lowest freq)
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> mapEntry : map.entrySet()){
            if(mapEntry.getValue() > max)
                max = mapEntry.getKey();
            else if(mapEntry.getValue() < min)
                min = mapEntry.getKey();
        }
        System.out.println("Maximum Frequency Element "+max+", with frequency "+map.get(max));
        System.out.println("Minimum Frequency Element "+min+", with frequency "+map.get(min));
    }
}
