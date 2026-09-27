import java.util.*;

class emi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p, r, n;
        System.out.print("Enter principle amount:");
        p = in.nextFloat();
        System.out.print("Enter ROI:");
        r = in.nextFloat();
        System.out.print("Enter no of years:");
        n = in.nextFloat();
        System.out.print("The total emi is : " + (p * r * (Math.pow(1 + r, n)) / (Math.pow(1 + r, n)) - 1));
    }
}
