import java.util.*;

class grade {
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
        float perc = (phy + chem + math + eng + comp) / 5;
        System.out.print("\nPercentage = " + perc);
        if (perc > 90) {
            System.out.println("\nA+ Grade");
        } else if (perc > 80 && perc <= 90) {
            System.out.println("\nA Grade");
        } else if (perc > 70 && perc <= 80) {
            System.out.println("\nB+ Grade");
        } else if (perc > 60 && perc <= 70) {
            System.out.println("\nB Grade");
        } else if (perc > 50 && perc <= 60) {
            System.out.println("\nC Grade");
        } else if (perc > 35 && perc <= 50) {
            System.out.println("\nP Grade");
        } else {
            System.out.println("\nFT Grade");
        }

    }
}
