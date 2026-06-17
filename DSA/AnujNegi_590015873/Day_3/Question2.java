import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                count++;
        }

        System.out.println(count);
        sc.close();
    }
}
