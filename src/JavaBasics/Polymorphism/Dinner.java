package JavaBasics.Polymorphism;

import org.jetbrains.annotations.NotNull;

public class Dinner {

    private void makeDinner(@NotNull Noodles noodle, String sauce) {
        noodle.cook();

        System.out.println("Mixing " + noodle.texture + " noodle made from " + noodle.ingredients + " with " + sauce + ".");
        System.out.println("Dinner is served!");
    }

    public static void main(String[] args) {

        Dinner dinnerNoodle = new Dinner();

        Noodles spaetzle = new Spaetzle();
        dinnerNoodle.makeDinner(spaetzle, "soy sauce with chili");
    }
}
