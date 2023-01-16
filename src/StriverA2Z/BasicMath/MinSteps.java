package StriverA2Z.BasicMath;

public class MinSteps {
    public static void main(String[] args) {
        int[] arr= {1, 4, 3, 2, 6, 7};
        int[] arr2 = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(minJumpsBetter(arr2));
       // System.out.println(minJumps(arr2,0,arr2.length-1));
        System.out.println(minJumps(arr2));
    }
    static int minNumOfSteps(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length;){

            int tempw2 = arr[i + arr[i]];
            if(tempw2 >= arr.length) {
                count++;
                break;
            }
            int temp = arr[tempw2];
            count++;
            i = temp;
        }
        return count;
    }
        static int minJumps(int arr[], int l, int h)
        {
            // Base case: when source
            // and destination are same
            if (h == l)
                return 0;

            // When nothing is reachable
            // from the given source
            if (arr[l] == 0)
                return Integer.MAX_VALUE;

            /*
             Traverse through all the points
             reachable from arr[l]. Recursively
             get the minimum number of jumps
             needed to reach arr[h] from these
             reachable points.
            */
            int min = Integer.MAX_VALUE;
            for (int i = l + 1; i <= h && i <= l + arr[l];
                 i++) {
                int jumps = minJumps(arr, i, h);
                if (jumps != Integer.MAX_VALUE
                        && jumps + 1 < min)
                    min = jumps + 1;
            }
            return min;
        }

        static int minJumpsBetter(int[] arr){
        if(arr.length <= 1)
            return 0;
        if(arr[0] == 0)
            return -1;

        int maxReachableIndex = arr[0];
        int stepsLeft = arr[0];
        int jumps = 1;

        for(int i = 1; i< arr.length; i++){
            if( i == arr.length-1)
                return jumps;
            maxReachableIndex = Math.max(maxReachableIndex, i + arr[i]);
            stepsLeft--;
            if(stepsLeft == 0) {
                jumps++;
                if (i >= maxReachableIndex)
                    return -1;

                stepsLeft = maxReachableIndex - i;
            }
        }
        return -1;
        }

    static int minJumps(int arr[])
    {
        if (arr.length <= 1)
            return 0;

        // Return -1 if not possible to jump
        if (arr[0] == 0)
            return -1;

        // initialization
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        // Start traversing array
        for (int i = 1; i < arr.length; i++) {
            // Check if we have reached
            // the end of the array
            if (i == arr.length - 1)
                return jump;

            // updating maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            // we use a step to get to the current index
            step--;

            // If no further steps left
            if (step == 0) {
                // we must have used a jump
                jump++;

                // Check if the current
// index/position or lesser index
                // is the maximum reach point
// from the previous indexes
                if (i >= maxReach)
                    return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxReach - i;
            }
        }

        return -1;
    }
    }


