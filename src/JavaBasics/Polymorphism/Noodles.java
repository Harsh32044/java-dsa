package JavaBasics.Polymorphism;

public class Noodles {
    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodles(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {

        System.out.println("Boiling.");

        this.texture = "cooked";

    }

    public String getCookPrep() {
        return "Boil in water for 7 mins and add veggies and sauce";
    }

    public static void main(String[] args) {

        Spaetzle kaesespaetzle = new Spaetzle();
        kaesespaetzle.cook();

    }
}
