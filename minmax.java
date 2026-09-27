import java.util.*;

class minmax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total num:");
        int n = in.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int min = arr[0];
        for (i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int max = arr[0];
        for (i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Minimum number from array is : " + min);
        System.out.print("Maxmimum number from array is : " + max);

    }
}
