package practiceproblems;
import java.util.*;

abstract class Staff {
    String name;

    Staff(String name) {
        this.name = name;
    }

    abstract double pay();
}

class FullTime extends Staff {
    double salary;

    FullTime(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    double pay() {
        return salary;
    }
}

class Hourly extends Staff {
    double hours, rate;

    Hourly(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double pay() {
        if (hours <= 40)
            return hours * rate;
        else
            return 40 * rate + (hours - 40) * rate * 1.5;
    }
}

class Intern extends Staff {
    double stipend;

    Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    double pay() {
        return stipend;
    }
}

public class WeeklyStaffPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Staff[] staff = new Staff[n];

        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            if (type.equals("FULLTIME")) {
                double salary = sc.nextDouble();
                staff[i] = new FullTime(name, salary);
            } 
            else if (type.equals("HOURLY")) {
                double hours = sc.nextDouble();
                double rate = sc.nextDouble();
                staff[i] = new Hourly(name, hours, rate);
            } 
            else if (type.equals("INTERN")) {
                double stipend = sc.nextDouble();
                staff[i] = new Intern(name, stipend);
            }

            System.out.printf("%s: %.2f%n", name, staff[i].pay());
            total += staff[i].pay();
        }

        System.out.printf("Total Payroll: %.2f%n", total);
        sc.close();
    }
}
