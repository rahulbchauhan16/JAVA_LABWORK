import java.util.*;

class sumdigit {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ob.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

}
