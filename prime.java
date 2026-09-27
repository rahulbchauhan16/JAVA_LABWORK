
// WAP to accept a number and check whether the number is prime or not. Use method name check (int n). The method returns
//1, if the number is prime otherwise, it returns 0. 
import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        int i;
        int result = prime(n);

        if (result == 1) {
            System.out.print("The Num is Prime.");
        } else {
            System.out.print("The Num is Not Prime.");
        }
    }

    public static int prime(int n) {
        int i;
        if (n <= 2) {
            return 0;
        }
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
