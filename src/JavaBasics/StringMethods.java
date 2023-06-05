package JavaBasics;

public class StringMethods {
    public static void main(String[] args) {

//compareTo()
        String name = "Harsh";
        String name2 = "haRsh";

        System.out.println(name2.compareTo(name));
        //If name comes before than name2 lexicographically, output is negative
        //if name and name2 have same position lexico, then 0
        //If name comes after name2 lexico, then output is positive

        //Lowercase letters have more ASCII values than uppercase letters

//indexOf

//      The indexOf() instance method can also return where the substring begins (the index of the first character in the substring)
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alp.indexOf("EFG"));
//        Works with characters as well
        System.out.println(alp.indexOf('R'));

//charAt(int index)
        System.out.println(alp.charAt(5));

//.substring(int begin) and .substring(int begin(inclusive), int end(exclusive))

        System.out.println(alp.substring(7)); //Beginning till end
        System.out.println(alp.substring(7,11)); //Beginning till 11 index, not including alp.charAt(11)
    }
}
