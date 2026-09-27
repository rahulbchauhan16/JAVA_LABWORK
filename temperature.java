//temperature from Fahrenheit to Celcius --> formula = (f - 32) * 5 / 9

import java.util.*;

class temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature:");
        float f = in.nextFloat();
        float Celcius = (f - 32) * 5 / 9;
        System.out.println("The temperature in Celcius is : " + Celcius);

    }

}
