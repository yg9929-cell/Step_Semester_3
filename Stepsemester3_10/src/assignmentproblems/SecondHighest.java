package assignmentproblems;
class SecondHighest {
    public static void main(String[] args) {
        int scores[] = {45, 78, 92, 78, 60};

        int highest = -1, second = -1;

        for (int s : scores) {
            if (s > highest) {
                second = highest;
                highest = s;
            } else if (s < highest && s > second) {
                second = s;
            }
        }

        System.out.println(second);
    }
}