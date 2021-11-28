package lesson8;

public class AnimalRunner {

    public static void main(String[] args) {
        Cat Vasya = new Cat("Вася", 3, "рыжий");
        Rooster Borya = new Rooster("Боря", 2, "черный");
        Horse Carlos = new Horse("Карлос", 4, "пегий");

        System.out.println(Vasya.toString());
        System.out.println(Borya.toString());
        System.out.println(Carlos.toString());

        System.out.println("-------------------");

        Animal[] animals = new Animal[]{Vasya, Borya, Carlos};
        for (Animal animal : animals) {
            animal.makeSounds();
        }
    }
}
