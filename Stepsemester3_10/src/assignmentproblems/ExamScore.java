package assignmentproblems;
class ExamScore {
    public static void main(String[] args) {
        int scores[] = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        int low = 42, high = 58;

        int left = 0, right = scores.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (scores[mid] < low)
                left = mid + 1;
            else
                right = mid;
        }

        int first = left;
        left = 0;
        right = scores.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (scores[mid] <= high)
                left = mid + 1;
            else
                right = mid;
        }

        int last = left;

        System.out.println(last - first);
    }
}
