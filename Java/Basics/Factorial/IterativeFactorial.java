import java.util.Scanner;

// This program calculates factorial of a number using iteration (loop)
public class IterativeFactorial {

    // Method to calculate factorial using a for loop
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i; // Multiply result by current number
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Scanner object to read input
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read user input

        // Print the result
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }
        sc.close(); // Close the scanner
    }
}
