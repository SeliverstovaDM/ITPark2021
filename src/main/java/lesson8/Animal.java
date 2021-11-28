package lesson8;

public class Animal {

    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void makeSounds() {
        System.out.println("Животное может издавать звуки.");
    }

    public String toString() {
        return "Животное по имени " +
                name + ", возраст " + age +
                " года, окрас - " + color + ".";
    }
}

