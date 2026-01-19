import java.util.function.BiFunction;

public class LastDigitSum {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sumLastDigits =
                (a, b) -> (a % 10) + (b % 10);

        System.out.println("Sum of last digits: " + sumLastDigits.apply(123, 456));
    }
}
