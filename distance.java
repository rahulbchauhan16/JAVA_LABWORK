import java.util.*;

class distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st point of distance:");
        int d1 = in.nextInt();
        System.out.print("Enter 2nd point of distance:");
        int d2 = in.nextInt();
        System.out.print("Enter 3nd point of distance:");
        int d3 = in.nextInt();
        System.out.print("Enter 3nd point of distance:");
        int d4 = in.nextInt();
        double D = Math.sqrt(((d2 - d1)) * ((d2 - d1)) + ((d4 - d3)) * ((d4 - d3)));
        System.out.print("The distance is : " + D + "\n");
    }
}
