import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = ob.nextInt();

        int[] colStart = new int[n + 1];
        colStart[1] = 1;
        int count = n;
        for (int i = 2; i <= n; i++) {
            colStart[i] = colStart[i - 1] + count;
            count--;
        }

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                int value = colStart[i] + (j - i);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}