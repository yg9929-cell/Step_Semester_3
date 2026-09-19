package assignmentproblems;

public class Password {
    private final String password;
    Password(String value) {
        password = value;
    }
    String getStrength() {
        int length = password.length();
        if (length < 6) {
            return "Weak";
        } else if (length <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
    public static void main(String[] args) {
        Password pc = new Password("abcd");
        System.out.println("Strength: " + pc.getStrength());
        Password pc2 = new Password("abcdefghij");
        System.out.println("Strength: " + pc2.getStrength());
    }
}