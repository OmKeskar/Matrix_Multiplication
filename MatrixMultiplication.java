import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrix 1: ");
        int rows1 = input.nextInt();
        System.out.print("Enter the number of columns for matrix 1: ");
        int cols1 = input.nextInt();

        System.out.print("Enter the number of rows for matrix 2: ");
        int rows2 = input.nextInt();
        System.out.print("Enter the number of columns for matrix 2: ");
        int cols2 = input.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            input.close();
            return;
        }

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        int[][] result = new int[rows1][cols2];

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
