import java.util.*;

class gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st num:");
        int a = in.nextInt();
        System.out.print("Enter 2nd num:");
        int b = in.nextInt();
        int c = (a < b) ? a : b;
        int i = 1;
        int min = i;
        for (i = 1; i <= c; i++) {
            if (a % i == 0 && b % i == 0) {
                min = i;
            }
        }
        System.out.print("The Greatest Divisor is : " + min);
    }
}
