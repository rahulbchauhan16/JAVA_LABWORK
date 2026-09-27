import java.util.*;

class shape {
    public class Circle {
        Scanner ob = new Scanner(System.in);
        float r;

        public void getDetails() {
            System.out.println("Enter the radius:");
            r = ob.nextFloat();
        }

        public void Display() {
            System.out.println("Area of Circle is : " + (3.14 * r * r));
        }
    }

    public class Triangle {
        Scanner ob = new Scanner(System.in);
        float base, height;

        public void getDetails() {
            System.out.println("Enter the Base:");
            base = ob.nextFloat();
            System.out.println("Enter the Height:");
            height = ob.nextFloat();

        }

        public void Display() {
            System.out.println("Area of Triangle is : " + (0.5 * base * height));
        }
    }

    public class Square {
        Scanner ob = new Scanner(System.in);
        int side;

        public void getDetails() {
            System.out.println("Enter the Side:");
            side = ob.nextInt();
        }

        public void Display() {
            System.out.println("Area of Square is : " + (side * side));
        }
    }
}

class shapeClass {
    public static void main(String[] args) {
        shape s = new shape();
        shape.Circle c1 = s.new Circle();
        shape.Triangle t1 = s.new Triangle();
        shape.Square s1 = s.new Square();
        c1.getDetails();
        t1.getDetails();
        s1.getDetails();
        c1.Display();
        t1.Display();
        s1.Display();
    }
}