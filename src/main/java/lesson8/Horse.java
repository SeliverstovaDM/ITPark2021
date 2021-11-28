package lesson8;

public class Horse extends Animal {

    public Horse(String name, int age, String color) {
        super(name, age, color);
    }

    public void makeSounds() {
        System.out.println("Лошадь фыркает и ржет.");
    }
}
