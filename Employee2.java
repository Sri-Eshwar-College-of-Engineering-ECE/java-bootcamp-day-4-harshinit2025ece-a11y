
class Employee2 {
    String employeeName;
    static int count = 0;

    Employee2(String name) {
        employeeName = name;
        count++;
    }

    void display() {
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        Employee2 e1 = new Employee2("Dhishaa");
        Employee2 e2 = new Employee2("Harshi");
        Employee2 e3 = new Employee2("Dak");

        e1.display();
        e2.display();
        e3.display();

        System.out.println("Total Employees: " + count);
    }
}
