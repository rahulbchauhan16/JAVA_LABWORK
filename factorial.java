import java.util.*;

class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = in.nextInt();
        int i = 1, fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial is : " + fact);
    }
}
