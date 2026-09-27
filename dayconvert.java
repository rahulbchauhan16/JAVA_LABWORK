import java.util.*;

class dayconvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of days:");
        int days = in.nextInt();
        int year, week, day;
        year = days / 365;
        week = (days % 365) / 7;
        day = (days % 365) % 7;
        System.out.print("Year : " + year + " Week : " + week + " Day : " + day);
    }

}
