import java.util.*;

class sumarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total size :");
        int n = in.nextInt();
        int i;
        int arr[] = new int[n];
        int sum = 0;
        System.out.print("Enter elements:");
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                sum += arr[i];
            }

        }
        System.out.print("Sum is :" + sum);

    }

}
