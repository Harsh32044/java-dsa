package StriverA2Z.Arrays.Easy;

public class SortCheck {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,-1};

        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){
        boolean sorted1 = true, sorted2=true;

        for(int i = 0; i< arr.length-1;i++) {
            if (!(arr[i] > arr[i + 1])) {
                if (!(arr[i] == arr[i + 1])) {
                    sorted1 = false;
                }


            }
        }
        for(int i = 0; i< arr.length-1;i++){
            if(!(arr[i] < arr[i+1])) {
                if (!(arr[i] == arr[i+1])){
                    sorted2 = false;
                }
            }
            }
        return sorted1 || sorted2;
        }
    }
