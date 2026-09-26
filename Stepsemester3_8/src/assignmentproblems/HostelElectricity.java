package assignmentproblems;
import java.util.*;
import java.util.function.Supplier;
interface Room {
    double calculateBill(int units, int occupants);
    String getType();
}
class SingleRoom implements Room {
    public double calculateBill(int units, int occupants) {
        return units * 8;
    }
    public String getType() {
        return "SINGLE";
    }
}
class SharedRoom implements Room {
    public double calculateBill(int units, int occupants) {
        return (units * 6) / occupants;
    }
    public String getType() {
        return "SHARED";
    }
}
class AcRoom implements Room {
    public double calculateBill(int units, int occupants) {
        return (units * 10) + 200;
    }
    public String getType() {
        return "AC";
    }
}
public class HostelElectricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Supplier<Room>> roomTypes = new HashMap<>();
        roomTypes.put("SINGLE", SingleRoom::new);
        roomTypes.put("SHARED", SharedRoom::new);
        roomTypes.put("AC", AcRoom::new);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();
            int occupants = 1;
            if (type.equals("SHARED")) {
                occupants = sc.nextInt();
            }
            Room room = roomTypes.get(type).get();
            double bill = room.calculateBill(units, occupants);
            System.out.printf("%s: %.2f%n", room.getType(), bill);
            total += bill;
        }
        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
