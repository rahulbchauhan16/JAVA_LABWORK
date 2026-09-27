import java.util.*;

class time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total second : ");
        int total_s = in.nextInt();
        int hrs = total_s / 3600;
        int min = (total_s % 3600) / 60;
        int sec = total_s % 60;
        System.out.printf("Time in HH:MM:SS format " + hrs + ":" + min + ":" + sec);
    }
}
