import java.io.*;
import java.util.*;

public class Solution {

    public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            totalSum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        long minSum = totalSum - max;
        long maxSum = totalSum - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        List<Integer> arr = new ArrayList<>();
        for (String s : input) {
            arr.add(Integer.parseInt(s));
        }

        miniMaxSum(arr);
    }
}
