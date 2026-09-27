class employee {
    int id;
    String name;
    int salary;

    employee() {

    }

    employee(int id) {
        this.id = id;
    }

    employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    employee(int salary, int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        employee e1 = new employee();
        employee e2 = new employee(101);
        employee e3 = new employee(101, "Ram");
        employee e4 = new employee(50000, 101, "Ram");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
