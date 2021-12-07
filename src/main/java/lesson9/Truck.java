package lesson9;

public final class Truck extends Automobile {
    @Override
    void move(int n) {
        if (n <= 1200) {
            System.out.println("Грузовой автомобиль проехал " + n + " километров.");
        } else System.out.println("Грузовой автомобиль не может проехать " + n + " километров на одном баке.");
    }
}

