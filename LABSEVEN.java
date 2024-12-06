import java.util.Scanner;

public class LABSEVEN {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Enter the rows of matrix1: ");
        int mat1_rows = key.nextInt();
        System.out.println("Enter the number of columns in matrix1: ");
        int mat1_cols = key.nextInt();

        System.out.println("Enter the number of rows in matrix2: ");
        int mat2_rows = key.nextInt();
        System.out.println("Enter the number of columns in matrix2: ");
        int mat2_cols = key.nextInt();

        // Ensure the dimensions match for summing the matrices
        if (mat1_rows != mat2_rows || mat1_cols != mat2_cols) {
            System.out.println("Dimension mismatch! Cannot sum the matrices");
            System.exit(0);
        }

        // create 2 matrices
        int[][] matrix1 = new int[mat1_rows][mat1_cols];
        int[][] matrix2 = new int[mat2_rows][mat2_cols];

        // Fill matrix1
        for (int i = 0; i < mat1_rows; i++) {
            for (int j = 0; j < mat1_cols; j++) {
                System.out.println("Enter the value of Matrix 1 at position(" + i + "," + j + "):");
                matrix1[i][j] = key.nextInt();
            }
        }

        // Fill matrix2
        for (int i = 0; i < mat2_rows; i++) {
            for (int j = 0; j < mat2_cols; j++) {
                System.out.println("Enter the value of Matrix 2 at position(" + i + "," + j + "):");
                matrix2[i][j] = key.nextInt();
            }
        }

        // Initialize sumMatrix
        int[][] sumMatrix = new int[mat1_rows][mat1_cols];

        // Sum matrices
        for (int i = 0; i < mat1_rows; i++) {
            for (int j = 0; j < mat1_cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print sumMatrix
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < mat1_rows; i++) {
            for (int j = 0; j < mat1_cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


