package assignmentproblems;
class AttendanceTracker {
    public static void main(String[] args) {
        int days[] = {1, 1, 0, 1, 1, 1, 0, 1};
        int present = 0, streak = 0, longest = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] == 1) {
                present++;
                streak++;
            } else {
                streak = 0;
            }

            if (streak > longest) {
                longest = streak;
            }
        }

        System.out.println("Present: " + present);
        System.out.println("Longest streak: " + longest);
    }
}