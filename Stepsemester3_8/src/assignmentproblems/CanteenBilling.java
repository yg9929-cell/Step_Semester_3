package assignmentproblems;
import java.util.*;
import java.util.function.Supplier;
interface Customer {
    double calculateAmount(double amount);
    String getType();
}
class Student implements Customer {
    public double calculateAmount(double amount) {
        return amount - (amount * 0.10);
    }
    public String getType() {
        return "STUDENT";
    }
}
class Staff implements Customer {
    public double calculateAmount(double amount) {
        return amount - (amount * 0.05);
    }
    public String getType() {
        return "STAFF";
    }
}
class Guest implements Customer {
    public double calculateAmount(double amount) {
        return amount + 10;
    }
    public String getType() {
        return "GUEST";
    }
}
public class CanteenBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Supplier<Customer>> customerTypes = new HashMap<>();
        customerTypes.put("STUDENT", Student::new);
        customerTypes.put("STAFF", Staff::new);
        customerTypes.put("GUEST", Guest::new);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            Customer customer = customerTypes.get(type).get();
            double finalAmount = customer.calculateAmount(amount);
            System.out.printf("%s: %.2f%n", customer.getType(), finalAmount);
            total += finalAmount;
        }
        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}