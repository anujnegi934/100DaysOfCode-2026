package Day_2;

public class Question1_LeetCode {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Question1_LeetCode sol = new Question1_LeetCode();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = sol.removeElement(nums, val);
        System.out.print("Output: k = " + k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}