import java.util.*;

class swap2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num:");
        int a = in.nextInt();
        System.out.print("Enter second num:");
        int b = in.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap:");
        System.out.println("First num: " + a);
        System.out.println("Second num: " + b);
    }

}
