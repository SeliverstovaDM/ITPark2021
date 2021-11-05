package lesson2;

public class Task1 {

    public static void main(String[] args) {
        int resultOfMultiply = multiply(25, 5);
        System.out.println("Результат умножения: " + resultOfMultiply);
        double resultOfDivision = division(39, 5);
        System.out.println("Результат деления: " + resultOfDivision);
        int resultOfAddition = addition(25, 5);
        System.out.println("Результат сложения: " + resultOfAddition);
        int resultOfSubtraction = subtraction(5, 10);
        System.out.println("Результат вычитания: " + resultOfSubtraction);
        int resultOfAdditionAndMultiply = additionAndMultiply(6);
        System.out.println("Результат прибавления 15 и умножения результата на 3: " + resultOfAdditionAndMultiply);
    }

    /**
     * Метод будет перемножать два аргумента и возвращать результат этой операции
     * @param number1   первый аргумент
     * @param number2   второй аргумент
     * @return  результат умножения двух чисел
     */
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static double division(int number1, int number2) {
        return (double) number1 / (double) number2;
    }

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int additionAndMultiply(int number) {
        return (number + 15) * 3;
    }
}
