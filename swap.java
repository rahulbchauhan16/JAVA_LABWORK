
// swap 2 nums using 3rd variable.
import java.util.*;

class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num:");
        int a = in.nextInt();
        System.out.print("Enter second num:");
        int b = in.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap:");
        System.out.println("First num: " + a);
        System.out.println("Second num: " + b);

    }
}
