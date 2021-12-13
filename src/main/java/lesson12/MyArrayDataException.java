package lesson12;

public class MyArrayDataException extends Throwable {
    int a;
    int b;


    public MyArrayDataException(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String message(){
        return "Неверные данные массива, в строке " + (a+1) + ", столбце " + (b+1) + " введите целое число";
    }
}
