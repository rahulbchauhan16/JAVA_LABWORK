import java.util.*;

class simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principle amount:");
        float p = in.nextFloat();
        System.out.print("Enter rate of interest:");
        float r = in.nextFloat();
        System.out.print("Enter time:");
        float t = in.nextFloat();
        float si = (p * r * t) / 100;
        System.out.print("The Simple Interest is : " + si);
    }
}
