package JavaBasics.Polymorphism;

public class NoodleRestaurant {
    String name;

    NoodleRestaurant(String naam) {
        this.name = naam;
    }

    public void order(Noodles noodles) {
        System.out.println(noodles.getCookPrep());
        System.out.println("Order for " + name + " is ready!");
    }

    public static void main(String[] args) {

        Noodles spaetzle, ramen;

        spaetzle = new Spaetzle();
        ramen = new Ramen();

        NoodleRestaurant cust1 = new NoodleRestaurant("Harsh");
        NoodleRestaurant cust2 = new NoodleRestaurant("Jai");

        cust1.order(spaetzle);
        cust2.order(ramen);
    }
}
