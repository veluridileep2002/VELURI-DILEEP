
import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        int[] divisors = {1,2,3,4,5,6,7,8,9};

        Map<Integer, Integer> counts = new LinkedHashMap<>();

        for (int d : divisors) {
            counts.put(d, 0);
        }

        for (int num : numbers) {
            for (int d : divisors) {
                if (num % d == 0) {
                    counts.put(d, counts.get(d) + 1);
                }
            }
        }

        System.out.print("{");
        boolean first = true;
        for (int d : divisors) {
            if (!first) System.out.print(", ");
            System.out.print(d + ": " + counts.get(d));
            first = false;
        }
        System.out.println("}");
    }
}