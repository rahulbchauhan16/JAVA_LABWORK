import java.util.*;

class meter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the distance in meter:");
        double meter = in.nextFloat();
        double Ans = meter * 3.28084;
        System.out.print("Ans = " + Ans);
    }
}
