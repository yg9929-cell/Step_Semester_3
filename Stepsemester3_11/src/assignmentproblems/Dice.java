package assignmentproblems;

public class Dice {

    public static void main(String[] args) {

        int[] rolls = {4, 1, 6, 4, 2, 1, 4};

        int[] result = diceSort(rolls);

        System.out.print("Sorted: [");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i < result.length - 1)
                System.out.print(", ");
        }

        System.out.println("]");
    }

    static int[] diceSort(int[] rolls) {

        int[] count = new int[7];

        for (int i = 0; i < rolls.length; i++) {
            count[rolls[i]]++;
        }

        System.out.print("Counts: ");

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ":" + count[i] + "  ");
        }

        System.out.println();

        int[] sorted = new int[rolls.length];
        int k = 0;

        for (int i = 1; i <= 6; i++) {

            for (int j = 0; j < count[i]; j++) {
                sorted[k] = i;
                k++;
            }
        }

        return sorted;
    }
}