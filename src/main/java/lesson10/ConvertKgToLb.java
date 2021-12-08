package lesson10;

public class ConvertKgToLb implements Converter {

    public double convert(double n) {
        double m = n * 2.2046226;
        return m;
    }
}
