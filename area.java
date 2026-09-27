
//square area = a2 , perimeter = 4a , rectangle area = l*b , perimeter = 2(l+b).
import java.util.*;

class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side:");
        int side = in.nextInt();
        int squareArea = side * side;
        int squarePerimeter = 4 * side;
        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);
        System.out.print("Enter length : ");
        int len = in.nextInt();
        System.out.print("Enter breadth : ");
        int breadth = in.nextInt();
        int rectangleArea = len * breadth;
        System.out.println("Rectangle Area: " + rectangleArea);
        int rectanglePerimeter = 2 * (len + breadth);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
    }
}