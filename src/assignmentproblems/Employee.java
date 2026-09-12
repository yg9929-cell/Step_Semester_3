package assignmentproblems;
class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public Employee(String id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
        isIntern = false;
    }

    public Employee(String id, String name) {
        this(id, name, 0);
        isIntern = true;
    }

    void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("E-101", "Divya", 65000);
        Employee e2 = new Employee("E-102", "Arjun");

        e1.printProfile();
        e2.printProfile();
    }
}