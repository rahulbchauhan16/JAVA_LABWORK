class Static {
    int id;

    Static(int id) {
        this.id = id;
    }

    void display() {
        System.out.println("Id is: " + this.id);
    }

    static void display1() {
        System.out.println("Static method called but not Allow to run.");
    }
}

class static1 {
    public static void main(String[] args) {
        Static s1 = new Static(101);
        Static.display(s1);

    }
}
