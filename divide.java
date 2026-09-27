import java.util.*;

class divide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting range");
        int start = in.nextInt();
        System.out.println("Enter ending range");
        int end = in.nextInt();
        int i;
        System.out.println("Nums that are divisible by 2 & not by 3");
        for (i = start; i <= end; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }
    }

}
    