package lesson6;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;


public class MinMaxMedium {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число - длину массива: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (100 * random());
        }
        System.out.println("Массив: " + Arrays.toString(array));

        double medium = (double) round(countMedium(array) * 100) / 100;
        System.out.println("Среднее значение : " + medium);

        int minimum = countMin(array);
        System.out.println("Минимальное значение : " + minimum);

        int maximum = countMax(array);
        System.out.println("Максимальное значение : " + maximum);
    }

    public static double countMedium(int[] newArray) {
        double result = 0;
        for (int j : newArray) {
            result += j;
        }
        return (result / newArray.length);
    }

    public static int countMin(int[] newArray) {
        int result = newArray[0];
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] < result) result = newArray[i];
        }
        return result;
    }

    public static int countMax(int[] newArray) {
        int result = newArray[0];
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] > result) result = newArray[i];
        }
        return result;
    }
}
