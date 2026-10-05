package assignmentproblems;
import java.util.Scanner;

abstract class Cab {
    double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double rate();

    boolean nightService() {
        return false;
    }

    double fare() {
        double amount = km * rate();

        if (amount < 100) {
            amount = 100;
        }

        return amount;
    }

    double finalFare(String time) {
        double amount = fare();

        if (time.equals("NIGHT")) {
            amount = amount * 1.20;
        }

        return amount;
    }
}

class Mini extends Cab {
    Mini(double km) {
        super(km);
    }

    double rate() {
        return 10;
    }
}

class Sedan extends Cab {
    Sedan(double km) {
        super(km);
    }

    double rate() {
        return 14;
    }

    boolean nightService() {
        return true;
    }
}

class SUV extends Cab {
    SUV(double km) {
        super(km);
    }

    double rate() {
        return 18;
    }

    boolean nightService() {
        return true;
    }
}

public class CityCabFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();

            Cab cab;

            if (type.equals("MINI")) {
                cab = new Mini(km);
            } else if (type.equals("SEDAN")) {
                cab = new Sedan(km);
            } else {
                cab = new SUV(km);
            }

            if (time.equals("NIGHT") && !cab.nightService()) {
                System.out.println(type + ": night service not available");
            } else {
                double fare = cab.finalFare(time);

                System.out.printf("%s: %.2f%n", type, fare);
                total += fare;
            }
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}