package JavaBasics.Polymorphism;

public class Spaetzle extends Noodles{

    Spaetzle() {
        super(30.8, 0.8, "irregular", "eggs, flour, salt");
        this.texture = "lumpy and liquid";
    }

    @Override
    public void cook() {
        System.out.println("Grinding or scraping dough.");
        System.out.println("Boiling");
    }

    @Override
    public String getCookPrep() {
        return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
    }
}
