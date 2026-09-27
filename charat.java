import java.util.*;

class charat {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a string:");
        String name = ob.nextLine();
        System.out.print("The character index is :" + name.charAt(2));
    }

}
