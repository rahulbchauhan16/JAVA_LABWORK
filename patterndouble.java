import java.util.*;

class patterndouble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = in.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}