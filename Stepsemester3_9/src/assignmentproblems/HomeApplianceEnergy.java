package assignmentproblems;
import java.util.Scanner;

abstract class Appliance {
    double hours;

    Appliance(double hours) {
        this.hours = hours;
    }

    abstract double power();

    boolean saverMode() {
        return false;
    }

    double units() {
        return power() * hours / 1000;
    }

    double saverUnits() {
        return units() * 0.75;
    }

    double cost(boolean saver) {
        if (saver) {
            return saverUnits() * 8;
        }

        return units() * 8;
    }
}

class Fridge extends Appliance {
    Fridge(double hours) {
        super(hours);
    }

    double power() {
        return 150;
    }
}

class AC extends Appliance {
    AC(double hours) {
        super(hours);
    }

    double power() {
        return 1500;
    }

    boolean saverMode() {
        return true;
    }
}

class TV extends Appliance {
    TV(double hours) {
        super(hours);
    }

    double power() {
        return 100;
    }
}

class Washer extends Appliance {
    Washer(double hours) {
        super(hours);
    }

    double power() {
        return 500;
    }

    boolean saverMode() {
        return true;
    }
}

public class HomeApplianceEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();

            boolean saver = false;

            if (sc.hasNext("SAVER")) {
                sc.next();
                saver = true;
            }

            Appliance appliance;

            if (type.equals("FRIDGE")) {
                appliance = new Fridge(hours);
            } else if (type.equals("AC")) {
                appliance = new AC(hours);
            } else if (type.equals("TV")) {
                appliance = new TV(hours);
            } else {
                appliance = new Washer(hours);
            }

            if (saver && !appliance.saverMode()) {
                System.out.println(type + ": saver mode not supported");
            } else {
                double units;

                if (saver) {
                    units = appliance.saverUnits();
                } else {
                    units = appliance.units();
                }

                double cost = appliance.cost(saver);

                System.out.printf(
                    "%s: Units=%.2f Cost=%.2f%n",
                    type, units, cost
                );

                total += cost;
            }
        }

        System.out.printf("Total Cost: %.2f%n", total);
        sc.close();
    }
}