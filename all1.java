import java.util.*;

class all1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter String : ");
        String a = ob.nextLine();
        System.out.println("The length of string is :" + a.length());
        String b = "     Rahul   ";
        System.out.println("After trimmed string is :" + b.trim());
        System.out.print("Enter a string for characterAt:");
        String c = ob.nextLine();
        System.out.println("The character index is :" + c.charAt(2));
        String name3 = "Rahul ", name4 = "Chauhan";
        System.out.println("The merged is :" + (name3 + name4));
        String str = "Rahul";
        System.out.println("The value of is :" + String.valueOf(2));
        System.out.println("The substring of is :" + str.substring(1, 4));
        int x = 123;
        System.out.println("Int to String is :" + Integer.toString(x));
        System.out.println("Equals : " + name3.equals(name4));

    }

}
