import java.util.*;

class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total size of array:");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter elements:");
        int i;
        for (i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        for (i = 0; i < size; i++) {
            System.out.print("The elements are : " + arr[i] + "\n");
        }
    }
}
