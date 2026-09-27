import java.util.*;

class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;

        for (i = 1; i <= 10; i++) {
            int multiply = n * i;
            System.out.println(n + "x" + i + "=" + multiply);
        }
    }

}
