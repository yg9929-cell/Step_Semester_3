package assignmentproblems;
import java.util.Arrays;

class DutyRoster {
    public static void main(String[] args) {
        String names[] = {"A", "B", "C", "D", "E"};
        int k = 2;
        int n = names.length;
        String result[] = new String[n];

        k = k % n;

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = names[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
