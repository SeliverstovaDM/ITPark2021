package lesson3;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Quadratic {

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите коэффициент а для квадратного уравнения: ");
        a = input.nextInt();
        System.out.println("Введите коэффициент b для квадратного уравнения: ");
        b = input.nextInt();
        System.out.println("Введите коэффициент c для квадратного уравнения: ");
        c = input.nextInt();
        System.out.println("Квадратное уравнение имеет вид: " + a + "*x*x + " + b + "*x + " + c + " = 0");
        String x = decideQuadratic(a, b, c);
        System.out.println(x);
    }

    public static String decideQuadratic(int a, int b, int c){
        double discriminant = b*b - 4*a*c;
        double x1, x2;
        if (a == 0) return "Первый коэффициент не может быть 0";
        else if (discriminant < 0) return "Нет действительных решений уравнения";
        else if (discriminant == 0) {
            x1 = -b / (2 * (double) a);
            return "Решение уравнения: " + x1;
        }
        else {x1 = (-b + sqrt(discriminant))/ (2 * a);
            String result1 = String.valueOf(x1);
            x2 = (-b - sqrt(discriminant))/ (2 * a);
            String result2 = String.valueOf(x2);
            return "Решения уравнения: " + result1 + " " + result2;
        }
    }
}
