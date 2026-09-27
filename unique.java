import java.util.*;

class unique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.print("Enter Array:");
        int[] arr = new int[n];
        int i, j;
        int count = 0;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int x = arr[0];
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == i) {
                count++;
            }
        }
        System.out.println("The number of unique elements in the array is: " + count);
    }
}
