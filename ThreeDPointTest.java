public class ThreeDPointTest {
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);

        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ", " + p1.getZ() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ", " + p2.getZ() + ")");
        System.out.println("Distance between the two points: " + p1.distance(p2));
    }
}

class MyPoint {
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
        return Math.sqrt((x - another.x) * (x - another.x)
                + (y - another.y) * (y - another.y));
    }
}

class ThreeDPoint extends MyPoint {
    private double z;

    public ThreeDPoint() {
        this(0, 0, 0);
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double distance(MyPoint another) {
        if (another instanceof ThreeDPoint) {
            ThreeDPoint p = (ThreeDPoint) another;
            return Math.sqrt((getX() - p.getX()) * (getX() - p.getX())
                    + (getY() - p.getY()) * (getY() - p.getY())
                    + (getZ() - p.getZ()) * (getZ() - p.getZ()));
        } else {
            return super.distance(another);
        }
     }
}