package lesson12;

public class ArraySum {

    public static int sum(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int total = 0;
        if (matrix.length != 4 || matrix[0].length != 4 || matrix[1].length != 4 || matrix[2].length != 4
                || matrix[3].length != 4) {
            throw new MyArraySizeException();
        } else {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String regex = "\\d+";
                if (!matrix[i][j].matches(regex)) {
                    throw new MyArrayDataException(i, j);
                }
                total += Integer.parseInt(matrix[i][j]);
            }
        }
        }
        return total;
    }
}


