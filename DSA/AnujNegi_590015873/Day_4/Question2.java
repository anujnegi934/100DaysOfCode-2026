import java.util.Arrays;

public class Question2 {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle k greater than array length

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        // copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 3;

        System.out.println("Before: " + Arrays.toString(nums));
        rotate(nums, k);
        System.out.println("After:  " + Arrays.toString(nums));
    }
}
