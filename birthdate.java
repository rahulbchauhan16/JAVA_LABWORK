import java.util.*;

class birthdate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the birth year:");
        int year = in.nextInt();
        System.out.print("Your age is :" + (2026 - year));
    }
}
