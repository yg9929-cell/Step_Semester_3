package practiceproblems;

public class Nickname {
    private final String firstName;
    private final String lastName;
    Nickname(String fullName) {
        String[] parts = fullName.split(" ");
        firstName = parts[0];
        lastName = parts[1];
    }
    String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }
    public static void main(String[] args) {
        Nickname tag = new Nickname("Maria Gomez");
        System.out.println("Nickname: " + tag.getNickname());
    }
}