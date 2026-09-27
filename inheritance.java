class Car {
    String type;
    String color;

    Car(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void Display() {
        System.out.println("Type is :" + this.type);
        System.out.println("Color is :" + this.color);
    }
}

class Toyota extends Car {
    String Name;

    Toyota(String Name) {
        super("Manual", "Black");
        this.Name = Name;
    }

    public void Display() {
        System.out.println("Name is : " + this.Name);
    }
}

class BMW extends Car {
    String name;

    BMW(String name) {
        super("Petrol", "Blue");
        this.name = name;
    }

    public void Display() {
        System.out.println("Name is : " + this.name);
    }

}

class Mercedes extends Car {
    String name;

    Mercedes(String name) {
        super("Diesel", "White");
        this.name = name;
    }

    public void Display() {
        System.out.println("Name is : " + this.name);
    }
}

class inheritance {
    public static void main(String[] args) {
        Toyota t1 = new Toyota("Fortuner Lengendar");
        BMW b1 = new BMW("M4 CS ");
        Mercedes m1 = new Mercedes("G-Wagon G63");
        b1.Display();
        m1.Display();
        t1.Display();
        t1.Display();
    }
}
