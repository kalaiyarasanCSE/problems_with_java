import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (int a) -> {
            if (a <= 1) return false;
            if (a == 2) return true;
            if (a % 2 == 0) return false;
            for (int i = 3; i * i <= a; i += 2) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return (int a) -> {
            int original = a;
            int reverse = 0;
            while (a > 0) {
                reverse = reverse * 10 + (a % 10);
                a /= 10;
            }
            return original == reverse;
        };
    }

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}

public class Solution {

    public static void main(String[] args) throws Exception {

        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] s = br.readLine().split(" ");
            int ch = Integer.parseInt(s[0]);
            int num = Integer.parseInt(s[1]);

            PerformOperation op;
            boolean result;

            if (ch == 1) {
                op = ob.isOdd();
                result = ob.checker(op, num);
                System.out.println(result ? "ODD" : "EVEN");

            } else if (ch == 2) {
                op = ob.isPrime();
                result = ob.checker(op, num);
                System.out.println(result ? "PRIME" : "COMPOSITE");

            } else if (ch == 3) {
                op = ob.isPalindrome();
                result = ob.checker(op, num);
                System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}
