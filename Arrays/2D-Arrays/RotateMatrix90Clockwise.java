public class RotateMatrix90Clockwise {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Step 1: Transpose the matrix
        for (int i = 0; i < matrix.length; i++) {

            for (int j = i + 1; j < matrix[i].length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int row = 0; row < matrix.length; row++) {
            reverse(matrix[row]);
        }

        // Print rotated matrix
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Reverse a single row using two pointers
    static void reverse(int[] row) {

        int start = 0;
        int end = row.length - 1;

        while (start < end) {

            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;

            start++;
            end--;
        }
    }
}