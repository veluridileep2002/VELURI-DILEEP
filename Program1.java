import java.util.Scanner;

public class Program1 {
    private final double a;
    private final double b;
    private final String operation;

    public Program1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() {
        switch (operation) {
            case "add" -> {
                return a + b;
            }
            case "subtract" -> {
                return a - b;
            }
            case "multiply" -> {
                return a * b;
            }
            case "divide" -> {
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return a / b;
            }
            default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        Program1 calculator = new Program1(a, b, operation);

        try {
            double result = calculator.calculate();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
