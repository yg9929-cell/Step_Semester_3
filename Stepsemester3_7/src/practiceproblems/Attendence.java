package practiceproblems;

public class Attendence {
    private String[] students;
    private int count;
    Attendence(int size) {
        students = new String[size];
        count = 0;
    }
    void markPresent(String name) {
        if (isPresent(name)) {
            System.out.println(name + " is already present");
        } else if (count < students.length) {
            students[count] = name;
            count++;
        } else {
            System.out.println("Attendance sheet is full");
        }
    }
    boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
    int getPresentCount() {
        return count;
    }
    public static void main(String[] args) {
        Attendence sheet = new Attendence(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println("Present Count: " + sheet.getPresentCount());
        System.out.println("Ben present: " + sheet.isPresent("Ben"));
        System.out.println("Chen present: " + sheet.isPresent("Chen"));
    }
}