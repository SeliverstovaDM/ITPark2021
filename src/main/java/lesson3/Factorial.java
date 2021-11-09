package lesson3;

public class Factorial {

    public static void main(String[] args) {
        int result = countFactorial(7);
        System.out.println("Факториал равен: " + result);
    }

    public static int countFactorial(int n) {
        int sum = 1;
        int i = 1;
        while (i <= n) {
            sum *= i;
            i++;
        }
        return sum;
    }
}
