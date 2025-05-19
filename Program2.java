import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter value of a: ");
            int a = scanner.nextInt();
            
            
            for (int i = 0; i < a; i++) {
                int oddNumber = 2 * i + 1;
                if (i != a - 1) {
                    System.out.print(oddNumber + ", ");
                } else {
                    System.out.print(oddNumber);
                }
            }
        }
    }
}
