import java.util.*;

class bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter bill units:");
        int call = in.nextInt();
        double price = 0;
        if (call <= 100) {
            price += 200;
            System.out.println("Total bill is : " + price);
        } else if (call <= 150 && call > 100) {
            price = (200) + ((call - 100) * 0.60);
            System.out.println("Total bill is : " + price);
        } else if (call <= 200 && call > 150) {
            price = (200) + (50 * 0.60) + ((call - 150) * 0.50);
            System.out.println("Total bill is : " + price);
        } else if (call > 200) {
            price = (200) + (50 * 0.60) + (50 * 0.50) + ((call - 200) * 0.40);
            System.out.println("Total bill is : " + price);
        }
    }
}

