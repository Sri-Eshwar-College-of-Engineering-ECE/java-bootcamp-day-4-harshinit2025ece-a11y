class Student2 {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Ram";
        s1.rollNo = 30;

        Student2 s2 = new Student2();
        s2.name = "Ravi";
        s2.rollNo = 50;

        s1.display();
        s2.display();
    }
}