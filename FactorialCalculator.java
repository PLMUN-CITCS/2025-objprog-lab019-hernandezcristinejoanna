import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get a valid non-negative integer from the user
        int number = getNonNegativeInteger(scanner);

        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }

    // Method to get a non-negative integer input from the user
    public static int getNonNegativeInteger(Scanner scanner) {
        int number;

        while (true) {
            try {
                System.out.print("Enter a non-negative integer: ");
                number = Integer.parseInt(scanner.nextLine());

                if (number >= 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Invalid input! Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        return number;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply each number from 1 to n
        }
        return factorial;
    }
}
