public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        System.out.println("Distance from p1 to (6, 8): " + p1.distance(6, 8));
    }
}