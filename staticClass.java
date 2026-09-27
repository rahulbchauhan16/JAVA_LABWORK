// 1st STATIC BLOCK executes --> 2nd MAIN method --> 3rd Function
// if function called in static method then 
//1st STATIC BLOCK executes --> 3rd Function --> 2nd MAIN method

class staticClass {
    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        System.out.println("Static method called || Main Method");
    }

    static {
        System.out.println("Static Block. Called before Main");
        staticClass.display();
    }
}
