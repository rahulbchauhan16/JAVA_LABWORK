//WAP to create Circle class with area and perimeter function to find area and perimeter of circle

import java.util.*;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class funareaperi {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double r = ob.nextFloat();
        Circle ans = new Circle(r);
        System.out.printf("Area is = %f \n", ans.area());
        System.out.printf("Perimeter is = %f  ", ans.area());
    }
}
