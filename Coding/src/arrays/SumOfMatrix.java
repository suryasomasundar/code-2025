package arrays;

public class SumOfMatrix {

    public static int matrixSum(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        for (int[] row : matrix) {
            if (row.length == 0) {
                return 0;
            }
        }

        int sum = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] nullMatrix = {{}};
        int[][] irregularMatrix = {{1, 2}, {}, {3, 4}};
        System.out.println(matrixSum(matrix));
        System.out.println(matrixSum(nullMatrix));
        System.out.println(matrixSum(irregularMatrix));

    }
}
