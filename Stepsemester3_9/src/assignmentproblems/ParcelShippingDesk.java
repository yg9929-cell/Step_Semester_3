package assignmentproblems;
import java.util.Scanner;

abstract class Parcel {
    double weight;
    double declaredValue;

    Parcel(double weight, double declaredValue) {
        this.weight = weight;
        this.declaredValue = declaredValue;
    }

    abstract double charge();

    double insurance() {
        return 0;
    }

    double total() {
        return charge() + insurance();
    }
}

class Standard extends Parcel {
    Standard(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    double charge() {
        return 40 + 10 * weight;
    }
}

class Express extends Parcel {
    Express(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    double charge() {
        return 80 + 15 * weight;
    }

    double insurance() {
        return declaredValue * 0.02;
    }
}

class Fragile extends Parcel {
    Fragile(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    double charge() {
        return 40 + 10 * weight + 50;
    }

    double insurance() {
        return declaredValue * 0.02;
    }
}

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double weight = sc.nextDouble();
            double value = sc.nextDouble();

            Parcel parcel;

            if (type.equals("STANDARD")) {
                parcel = new Standard(weight, value);
            } else if (type.equals("EXPRESS")) {
                parcel = new Express(weight, value);
            } else {
                parcel = new Fragile(weight, value);
            }

            double charge = parcel.charge();
            double insurance = parcel.insurance();
            double total = parcel.total();

            System.out.printf(
                "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                type, charge, insurance, total
            );

            grandTotal += total;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);
        sc.close();
    }
}