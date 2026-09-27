import java.util.*;

class calci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1:");
        int a = in.nextInt();
        System.out.println("Enter num2");
        int b = in.nextInt();
        System.out.println("Enter choice (+,-,/,*,%) : ");
        char choice = in.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println("Sum is : " + (a + b));
                break;
            case '-':
                System.out.println("Sum is : " + (a - b));
                break;
            case '/':
                System.out.println("Sum is : " + (a / b));
                break;
            case '*':
                System.out.println("Sum is : " + (a * b));
                break;
            case '%':
                System.out.println("Sum is : " + (a % b));
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
