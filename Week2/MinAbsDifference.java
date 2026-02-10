import java.util.*;

public class MinAbsDifference {
    public static void main(String[] args) {
        int[] arr = {3, -7, 0};
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        System.out.println(minDiff);
    }
}
