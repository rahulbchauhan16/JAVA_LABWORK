import java.util.*;

class marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the marks of physics:");
        int phy = in.nextInt();
        System.out.print("Enter the marks of chemistry:");
        int chem = in.nextInt();
        System.out.print("Enter the marks of math:");
        int math = in.nextInt();
        System.out.print("Enter marks of english: ");
        int eng = in.nextInt();
        System.out.print("Enter marks of computer:");
        int comp = in.nextInt();
        System.out.print("Total marks  = " + (phy + chem + math + eng + comp));
        float percentage = (phy + chem + math + eng + comp) / 5;
        System.out.print("\nPercentage = " + percentage);

    }
}
