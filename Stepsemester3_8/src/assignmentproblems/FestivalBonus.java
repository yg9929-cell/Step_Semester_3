package assignmentproblems;
import java.util.*;
interface Employee {
    double calculateBonus(double salary);
    String getName();
}
class FullTime implements Employee {
    String name;
    FullTime(String name) {
        this.name = name;
    }
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
    public String getName() {
        return name;
    }
}
class PartTime implements Employee {
    String name;
    PartTime(String name) {
        this.name = name;
    }
    public double calculateBonus(double salary) {
        return salary * 0.05;
    }
    public String getName() {
        return name;
    }
}
class Intern implements Employee {
    String name;
    Intern(String name) {
        this.name = name;
    }
    public double calculateBonus(double salary) {
        return 2000;
    }
    public String getName() {
        return name;
    }
}
public class FestivalBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();
            Employee employee;
            if (type.equals("FULLTIME")) {
                employee = new FullTime(name);
            } else if (type.equals("PARTTIME")) {
                employee = new PartTime(name);
            } else {
                employee = new Intern(name);
            }
            double bonus = employee.calculateBonus(salary);
            System.out.printf("%s: %.2f%n", employee.getName(), bonus);
            total += bonus;
        }
        System.out.printf("Total Bonus: %.2f%n", total);
        sc.close();
    }
}