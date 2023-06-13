package JavaBasics.Inheritance;

public class Noodles {
    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";

    Noodles(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {
        this.texture = "cooked";
    }

    public static void main(String[] args) {
        Pho ph = new Pho();

        System.out.printf("Length: %f", ph.lengthInCentimeters);


    }
}
