abstract class Vegetable {
    String color;

    Vegetable(String color) {
        this.color = color;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " is " + color + " in color.";
    }
}

class Potato extends Vegetable {
    Potato(String color) {
        super(color);
    }
}

class Brinjal extends Vegetable {
    Brinjal(String color) {
        super(color);
    }
}

class Tomato extends Vegetable {
    Tomato(String color) {
        super(color);
    }
}

class VegetableDemo {
    public static void main(String[] args) {
        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");

        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}