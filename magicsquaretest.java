public class magicsquaretest {
 
    public static boolean MagicSquare(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) {
                return false; 
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[0][i];
        }
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != sum) {
                return false; 
            }
        }
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != sum) {
                return false; 
            }
        }

        int mainDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        if (mainDiagonalSum != sum) {
            return false; 
        }
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += matrix[i][n - i - 1];
        }
        if (secondaryDiagonalSum != sum) {
            return false; 
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };
        System.out.println("Test Case 1 - Expected: true, Result: " + MagicSquare(matrix1));
    }
}
