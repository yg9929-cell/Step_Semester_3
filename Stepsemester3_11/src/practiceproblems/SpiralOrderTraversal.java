package practiceproblems;

public class SpiralOrderTraversal {

    public static void main(String[] args) {

        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int top = 0;
        int bottom = 2;
        int left = 0;
        int right = 2;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                System.out.print(grid[top][i] + " ");

            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(grid[i][right] + " ");

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(grid[bottom][i] + " ");

                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(grid[i][left] + " ");

                left++;
            }
        }
    }
}