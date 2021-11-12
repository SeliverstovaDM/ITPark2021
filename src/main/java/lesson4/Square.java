package lesson4;

public class Square {

    public static void main(String[] args) {
        int n = 81;
        int result = countSquare(n);
        System.out.println("Квадратный корень из числа " + n + " равен: " + result);
    }

    public static int countSquare(int n) {
        int i;
        for (i = 1; i * i != n; i++) ;
        return i;
    }
}
