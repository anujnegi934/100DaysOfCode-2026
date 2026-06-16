package Day_2;

public class Question2 {
    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 2, 5};
        System.out.println(findLargest(arr));
    }
}