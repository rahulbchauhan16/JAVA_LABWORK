
//calculate clock angle between hour & min
import java.util.*;

class clock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hour:");
        int hour = in.nextInt();
        System.out.println("Enter the minute:");
        int minute = in.nextInt();
        double hour_angle = 0.5 * (hour * 60 + minute);
        double minute_angle = 6 * minute;
        double angle = Math.abs(hour_angle - minute_angle);
        System.out.println("The angle between hour and minute is: " + angle);
    }
}