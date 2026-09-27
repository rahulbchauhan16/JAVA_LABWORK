import java.util.*;

class transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total rows:");
        int r = in.nextInt();
        System.out.print("Enter total columns:");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        int i, j;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Transposed Array is:");
        for (j = 0; j < c; j++) {
            for (i = 0; i < r; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
