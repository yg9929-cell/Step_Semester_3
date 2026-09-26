package assignmentproblems;
import java.util.*;
import java.time.LocalDate;
interface Plan {
    LocalDate getRenewalDate(LocalDate startDate);
    String getName();
}
class Basic implements Plan {
    String name;
    Basic(String name) {
        this.name = name;
    }
    public LocalDate getRenewalDate(LocalDate startDate) {
        return startDate.plusDays(30);
    }
    public String getName() {
        return name;
    }
}
class Standard implements Plan {
    String name;
    Standard(String name) {
        this.name = name;
    }
    public LocalDate getRenewalDate(LocalDate startDate) {
        return startDate.plusDays(90);
    }
    public String getName() {
        return name;
    }
}
class Premium implements Plan {
    String name;
    Premium(String name) {
        this.name = name;
    }
    public LocalDate getRenewalDate(LocalDate startDate) {
        return startDate.plusDays(365);
    }
    public String getName() {
        return name;
    }
}
public class StreamingPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            String date = sc.next();
            LocalDate startDate = LocalDate.parse(date);
            Plan plan;
            if (type.equals("BASIC")) {
                plan = new Basic(name);
            } else if (type.equals("STANDARD")) {
                plan = new Standard(name);
            } else {
                plan = new Premium(name);
            }
            LocalDate renewalDate = plan.getRenewalDate(startDate);
            System.out.println(plan.getName() + ": " + renewalDate);
        }
        sc.close();
    }
}