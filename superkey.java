class Car {
    String name;
    String brand;
    String type;

    Car(String name, String brand, String type) {
        this.name = name;
        this.brand = brand;
        this.type = type;
    }

    public void Display() {
        System.out.println("Car name is :" + name);
        System.out.println("Car Brand is :" + brand);
        System.out.println("Car Type is :" + type);
    }
}

class Toyota extends Car {
    String ctype;

    Toyota(String name, String brand, String type, String ctype) {
        super(name, brand, type);
        this.ctype = ctype;
    }

    public void Display() {
        System.out.println("Car name is :" + name);
        System.out.println("Car Brand is :" + brand);
        System.out.println("Car Type is :" + type);
        System.out.println("Car Fuel Type : " + ctype);
    }

}

class superkey {
    public static void main(String[] args) {
        Car c1 = new Car("BMW M5", "BMW", "sedan");
        c1.Display();
        Toyota t1 = new Toyota("Fortuner", "Toyota", "SUV", "Diesel");
        t1.Display();

    }
}
