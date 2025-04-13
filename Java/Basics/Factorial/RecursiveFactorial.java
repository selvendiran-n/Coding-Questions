import java.util.Scanner;

// This program calculates factorial of a number using recursion
public class RecursiveFactorial {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // Scanner to take user input
        System.out.print("Enter a number :");
        int num = scanner.nextInt(); // Read input number

        // Print the result
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }
        scanner.close(); // Close the scanner
    }
}
