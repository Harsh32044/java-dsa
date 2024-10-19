package StriverA2Z.patterns;

public class Patterns {

    public static void main(String[] args) {
        nStarTriangle(10);
        nStarInvertedTrinagle(10);
    }

    public static void nStarTriangle(int n) {

        for (int i = n; i > 0; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }
            for (int l = n; l > i; l--) {
                System.out.print("*");
            }


            System.out.println();
        }
    }

    public static void nStarInvertedTrinagle(int n) {

        for (int i = n; i > 0; i--) {


            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            for (int l = 0; l < i-1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
