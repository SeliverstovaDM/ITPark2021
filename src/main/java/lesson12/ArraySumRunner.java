package lesson12;

import static lesson12.ArraySum.sum;

public class ArraySumRunner {
    public static void main(String[] args) {

        String[][] example1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "h"}, {"5", "5", "5", "5"}};

        try {
            System.out.println("Сумма элементов массива: " + sum(example1));
        } catch (MyArraySizeException e) {
            System.out.println("Введен массив неверного размера, требуется размер 4*4");
        } catch (MyArrayDataException e) {
            System.out.println(e.message());
        }
    }
}
