import java.util.*;

class numthree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = in.nextInt();
        System.out.print("Enter b:");
        int b = in.nextInt();
        System.out.print("Enter c:");
        int c = in.nextInt();
        if (a > b && a > c) {
            System.out.print("A is Greater.");
        } else if (b > a && b > c) {
            System.out.print("B is Greater.");
        } else if (c > a && c > b) {
            System.out.print("C is Greater.");
        } else if (a == b && a > c) {
            System.out.print("A & B are same & greater than C.");
        } else if (b == c && b > a) {
            System.out.print("B & C are same & greater than A.");
        } else if (a == c && a > b) {
            System.out.print("A & C are same & greater than B.");
        } else {
            System.out.print("All values are equal.");
        }
    }

}
