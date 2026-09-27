import java.util.*;

class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a);
        System.out.print(" " + b);
        for (int i = 0; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}
