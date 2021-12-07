package lesson9;

public class AutomobileRunner {

    public static void main(String[] args) {

        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = new Car();
        Car forthCar = new Car();
        Car fifthCar = new Car();
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        Truck thirdTruck = new Truck();
        Truck forthTruck = new Truck();
        Truck fifthTruck = new Truck();

        Automobile[] autos = new Automobile[]{firstCar, firstTruck, secondCar, secondTruck, thirdCar, thirdTruck,
                forthCar, fifthCar, forthTruck, fifthTruck};
        for (Automobile auto : autos) {
            auto.move((int) (Math.random() * 1500));
        }
    }
}
