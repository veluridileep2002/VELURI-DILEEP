import java.util.Scanner;

public class Program3 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter value of a: ");
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                System.out.println("You entered: " + a);
            } else {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }
}