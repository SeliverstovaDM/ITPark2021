package lesson8;

public class Rooster extends Animal {

    public Rooster(String name, int age, String color) {
        super(name, age, color);
    }

    public void makeSounds() {
        System.out.println("Петух кукарекает.");
    }
}
