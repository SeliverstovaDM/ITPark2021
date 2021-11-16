package lesson5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер нужного члена последовательности Фибоначчи: ");
        a = input.nextInt();
        int result = countFibonacci(a);
        System.out.println("Значение данного члена последовательности Фибоначчи: " + result);
    }

    public static int countFibonacci(int n) {
        int b = 0;
        int c = 1;
        for (int i = 2; i <= n; i++) {
            c += b;
            b = c - b;
        }
        return b;
    }
}