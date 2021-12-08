package lesson10;

public class ConvertLbToKg implements Converter {

    public double convert(double n) {
        double m = n * 0.4535923745;
        return m;
    }
}
