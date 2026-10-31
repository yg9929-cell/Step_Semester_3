package practiceproblems;

public class PairSumSortedArray {

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 5, 9};
        int target = 4;

        int left = 0;
        int right = nums.length - 1;

        boolean found = false;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println("(" + nums[left] + ", " + nums[right] + ")");
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found)
            System.out.println("Not Found");
    }
}