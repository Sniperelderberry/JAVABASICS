import java.util.Scanner;

public class AddingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 2; // Define the size of the matrices
        int[][] a = new int[SIZE][SIZE];
        int[][] b = new int[SIZE][SIZE];
        int[][] c = new int[SIZE][SIZE];

        // Input for matrix a
        System.out.println("Enter elements of matrix a:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input for matrix b
        System.out.println("Enter elements of matrix b:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Display matrices a and b
        System.out.println("Elements of matrix a:");
        printMatrix(a);
        System.out.println("Elements of matrix b:");
        printMatrix(b);

        // Perform element-wise addition
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                c[i][j] = a[i][j] + b[i][j]; // Perform addition
            }
        }

        // Display the result of addition
        System.out.println("Result of addition:");
        printMatrix(c);

        sc.close();
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
