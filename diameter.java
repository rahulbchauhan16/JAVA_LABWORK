//diameter = sqrt -->radius/pi  & 2*radius

import java.util.*;

class diameter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:");
        int radius = in.nextInt();
        int diameter = 2 * radius;
        System.out.println("The diameter is : " + diameter);
    }
}
