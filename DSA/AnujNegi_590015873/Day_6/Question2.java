import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {2, 3};

        Set<Integer> set = new TreeSet<>();
        for (int x : arr1) set.add(x);
        for (int x : arr2) set.add(x);

        System.out.println(set);
    }
}
