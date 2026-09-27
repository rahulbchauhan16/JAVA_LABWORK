import java.util.*;

class vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter character to check:");
        char x = in.next().charAt(0);
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O'
                || x == 'U') {
            System.out.print("The character entered is Vowel.");
        } else {
            System.out.print("The character is Consonant.");
        }
    }

}
