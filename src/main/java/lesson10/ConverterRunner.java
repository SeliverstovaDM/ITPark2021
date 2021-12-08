package lesson10;

import java.util.Scanner;

public class ConverterRunner {

    public static void main(String[] args) {
        Converter C;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число 1, если необходим перевод из килограммов в фунты, \n" +
                "или число 2, если необходим перевод из фунтов в килограммы:");
        int choice = input.nextInt();

        System.out.println("Введите вес, который необходимо перевести: ");
        double a = input.nextDouble();
        if (choice == 1) {
            C = new ConvertKgToLb();
            System.out.println(a + " килограмм в фунтах равно: " + C.convert(a));
        } else if (choice == 2) {
            C = new ConvertLbToKg();
            System.out.println(a + " фунтов в килограммах равно: " + C.convert(a));
        } else {
            System.out.println("Неверный ввод.");
        }
    }
}
