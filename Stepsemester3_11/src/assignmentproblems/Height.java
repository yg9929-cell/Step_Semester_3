package assignmentproblems;

public class Height {

    public static void main(String[] args) {

        int[] heights = {4, 2, 5, 1};

        int pass = 1;
        boolean swapped;

        do {
            swapped = false;

            for (int j = 0; j < heights.length - 1; j++) {

                if (heights[j] > heights[j + 1]) {

                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;

                    swapped = true;
                }
            }

            System.out.print("Pass " + pass + ": [");

            for (int i = 0; i < heights.length; i++) {
                System.out.print(heights[i]);

                if (i < heights.length - 1)
                    System.out.print(", ");
            }

            System.out.println("]");

            pass++;

        } while (swapped);
    }
}