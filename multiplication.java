import java.util.*;

class multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows1:");
        int r1 = in.nextInt();
        System.out.print("Enter number of columns1:");
        int c1 = in.nextInt();
        int[][] matrix1 = new int[r1][c1];
        int i, j;
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                matrix1[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter number of rows2:");
        int r2 = in.nextInt();
        System.out.print("Enter number of columns2:");
        int c2 = in.nextInt();
        int[][] matrix2 = new int[r2][c2];
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                matrix2[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        int[][] matrix3 = new int[r1][c1];
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                matrix3[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        System.out.println("The Multiplied Matrix is : ");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
