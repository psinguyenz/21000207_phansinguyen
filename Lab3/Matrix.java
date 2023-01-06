import java.util.*;

public class Matrix {
    public static void createRandomMatrix(int[][] matrix) {
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = in.nextInt();
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = in.nextInt();
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length) {
            if (matrix1[0].length == matrix2[0].length) {
                return true;
            }
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length == matrix2.length) {
            if (matrix1[0].length == matrix2[0].length) {
                return true;
            }
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix2.length][matrix1[0].length];
        for (int row = 0; row < matrix2.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = 0;
                for (int count = 0; count < matrix1.length; count++)
                    matrix[row][col] = matrix[row][col] + matrix1[row][count] * matrix2[count][col];
            }
        }
        return matrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[matrix2.length][matrix1[0].length];
        for (int row = 0; row < matrix2.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = 0.0;
                for (int count = 0; count < matrix1.length; count++)
                    matrix[row][col] = matrix[row][col] + matrix1[row][count] * matrix2[count][col];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rows of matrix1: ");
        int rows = in.nextInt();
        System.out.println("Enter the cols of matrix1: ");
        int cols = in.nextInt();
        int[][] matrix1 = new int[rows][cols];
        matrix1 = createRandomMatrix(rows, cols);
        print(matrix1);
        System.out.println("Enter the rows of matrix2: ");
        int rows2 = in.nextInt();
        System.out.println("Enter the cols of matrix2: ");
        int cols2 = in.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        matrix2 = createRandomMatrix(rows2, cols2);
        print(matrix2);
        if (haveSameDimension(matrix1, matrix2) == true) {
            System.out.print("The two matrixes have the same dimension");
            int[][] matrixplus = new int[rows][cols];
            matrixplus = add(matrix1, matrix2);
            print(matrixplus);
            int[][] matrixminus = new int[rows][cols];
            matrixminus = subtract(matrix1, matrix2);
            print(matrixminus);
        } else if (rows == cols2) {
            int[][] matrixtimes = new int[rows2][cols];
            matrixtimes = multiply(matrix1, matrix2);
            print(matrixtimes);
        } else {
            System.out.println("The two matrixes don't have the same dimension");
        }
    }
}
