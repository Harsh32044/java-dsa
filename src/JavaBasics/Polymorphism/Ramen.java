package JavaBasics.Polymorphism;

public class Ramen extends Noodles{
    Ramen() {
        super(30.0, 0.3, "flat", "wheatflour");
    }

    public String getCookPrep() {
        return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables";
    }
}
