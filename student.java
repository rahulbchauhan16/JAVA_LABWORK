class Student {
    int age;
    String name;
    int marks;

    Student() {

    }

    Student(int age) {
        this.age = age;
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Student(int marks, int age, String name) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class studentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(20);
        Student s3 = new Student(20, "Ram");
        Student s4 = new Student(90, 20, "Ram");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}