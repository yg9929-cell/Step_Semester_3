package practiceproblems;
class Student {
    String name;
    int marks[];

    Student(String n, int m[]) {
        name = n;
        marks = m;
    }

    double average() {
        int sum = 0;
        for (int m : marks)
            sum += m;
        return sum / 3.0;
    }

    void display() {
        double avg = average();
        char grade;

        if (avg >= 75)
            grade = 'B';
        else if (avg >= 60)
            grade = 'C';
        else if (avg >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.printf("%s: Average %.1f, Grade %c%n",
                name.toUpperCase(), avg, grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Asha", new int[]{80, 90, 70});
        Student s2 = new Student("Ravi", new int[]{60, 55, 50});

        s1.display();
        s2.display();
    }
}