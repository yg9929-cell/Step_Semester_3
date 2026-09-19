package assignmentproblems;

public class TrafficLight {
    private String color;
    private final String id;
    TrafficLight(String lightId) {
        id = lightId;
        color = "RED";
    }
    String getId(){
        return id;
    }
    void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else {
            color = "RED";
        }
    }
    String getColor() {
        return color;
    }
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println("ID: " + t.getId());
        System.out.println("Color: " + t.getColor());

        t.next();
        System.out.println("Color: " + t.getColor());

        t.next();
        System.out.println("Color: " + t.getColor());

        t.next();
        System.out.println("Color: " + t.getColor());
    }
}