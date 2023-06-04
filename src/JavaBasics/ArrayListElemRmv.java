package JavaBasics;

import java.util.ArrayList;

public class ArrayListElemRmv {
    public static void main(String[] args) {

        ArrayList<String> lunchBox = new ArrayList<String>();

        lunchBox.add("apple");
        lunchBox.add("ants");
        lunchBox.add("ants");
        lunchBox.add("banana");
        lunchBox.add("orange");
        lunchBox.add("ants");

        lunchBox = removeAntsForLoop(lunchBox);

        System.out.println(lunchBox.toString());
    }

    public static ArrayList<String> removeAnts(ArrayList<String> lunch) {

        /*When using a while loop and removing elements from an ArrayList, we should not increment the while loop’s counter
        whenever we remove an element. We don’t need to increase the counter because all the other elements have now shifted to the left.

        For example, if we removed the element at index 3, then the element that was at index 4 will be moved to index 3. If
        we increase our counter to 4, we’ll skip that element!*/
        int i = 0;
        while (i < lunch.size()) {
            if (lunch.get(i).equals("ants")) {
                lunch.remove(i);
                continue;
            }
            i++;
        }

        return lunch;
    }

    public static ArrayList<String> removeAntsForLoop(ArrayList<String> lunch) {

        /*
        * When using a for loop, we, unfortunately, must increase our loop control variable — the loop control variable will always
        * change when we reach the end of the loop (and it will usually change by 1 because we often use something like i++.) Since we can’t avoid
        * increasing our loop control variable, we can take matters into our own hands and decrease the loop control variable whenever
        * we remove an item.*/

        for (int i = 0; i < lunch.size(); i++) {
            if (lunch.get(i).equals("ants")) {
                lunch.remove(i);
                i--; // reducing i count, since i++ is bound to happen in for loop
            }
        }

        return lunch;
    }
}
