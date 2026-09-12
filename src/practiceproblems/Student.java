package practiceproblems;
class Student {

    String name;
    double attendance;

    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    Student(String n, double a) {
        name = n;
        attendance = a;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }

    public static void main(String[] args) {

        new Student("Ravi", 85.5);
        new Student("Anitha", 90.0);

        Student.printCollegeInfo();
    }
}
