import java.util.*;

class matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int r = in.nextInt();
        System.out.print("Enter number of columns:");
        int c = in.nextInt();
        int[][] matrix = new int[r][c];
        int i, j;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("The Matrix is : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
