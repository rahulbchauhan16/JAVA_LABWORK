import java.util.*;

class positive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("Positive Num");
        } else if (num == 0) {
            System.out.println("Num is Zero");
        } else {
            System.out.print("Negative num");
        }
    }
}
