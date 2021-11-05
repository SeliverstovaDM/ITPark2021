package lesson2;

import static java.lang.Math.*;

public class Task2 {

    public static void main(String[] args) {
        double result = hypot(3, 4);
        System.out.println("Длина гипотенузы треугольника равна " + result);
    }

    /**
     * Метод вычисляет длину гипотенузы прямоугольного треугольника по заданным катетам
     * @param katet1 первый катет
     * @param katet2 второй катет
     * @return длина гипотенузы
     */
    public static double hypot(double katet1, double katet2){
        return sqrt(pow(katet1, 2) + pow(katet2, 2));
    }
}
