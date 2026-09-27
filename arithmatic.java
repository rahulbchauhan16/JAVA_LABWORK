import java.util.*;

class arithmatic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first num:");
        int a = in.nextInt();
        System.out.print("Enter second num:");
        int b = in.nextInt();
        System.out.print("Enter choice +,-,/,*,% : ");
        char choice;
        choice = in.next().charAt(0);
        if (choice == '+') {
            System.out.print("Ans = " + (a + b));
        } else if (choice == '-') {
            System.out.print("Ans = " + (a - b));
        } else if (choice == '*') {
            System.out.print("Ans = " + (a * b));
        } else if (choice == '/') {
            System.out.print("Ans = " + (a / b));
        } else if (choice == '%') {
            System.out.print("Ans = " + (a % b));
        } else {
            System.out.print("Invalid choice,Plz enter valid choice.");
        }
    }

}