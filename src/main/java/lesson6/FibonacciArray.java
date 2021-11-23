package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciArray {

    public static void main(String[] args) {
        int n = 46;
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= 12; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Предзаполненный массив: " + Arrays.toString(fibonacci));
        Scanner input = new Scanner(System.in);
        System.out.println("Введите нужный номер в последовательности Фибоначчи от 1 до 45: ");
        int x = input.nextInt();
        int result;
        if ((x > 0) & (x <= 12)) {
            result = fibonacci[x];
            System.out.println("Запрашиваемое значение в последовательности Фибоначчи равно: " + result);
        } else if ((x > 12) & (x < 46)) {
            for (int i = 13; i <= x; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            result = fibonacci[x];
            System.out.println("Запрашиваемое значение в последовательности Фибоначчи равно: " + result);
            System.out.println("Массив после заполнения: " + Arrays.toString(fibonacci));
        } else {
            System.out.println("Ошибка, неверно введено число");
        }
    }
}
