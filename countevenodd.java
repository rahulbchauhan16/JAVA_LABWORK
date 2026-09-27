import java.util.*;

class countevenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total size:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements:");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int even = 0, odd = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("The even count is : " + even + "\n");
        System.out.print("The odd count is : " + odd + "\n");
    }
}
