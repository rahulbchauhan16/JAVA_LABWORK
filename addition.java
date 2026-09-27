import java.util.*;

class addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first num:");
        int a = in.nextInt();
        System.out.print("Enter the second num:");
        int b = in.nextInt();
        System.out.print("Enter the third num:");
        int c = in.nextInt();
        int sum = a + b + c;
        System.out.println("The sum is : " + sum);
    }
}
