package recursive;

public class FactorialEksempel {
    // Recursive factorial method
    public static int factorial(int n) {
        if (n == 0) return 1;               // Base case: if n is 0, return 1
        return n * factorial(n - 1);        // Recursive case: n * factorial(n-1)
    }
    public static void main(String[] args) {
        int result = factorial(5);          // Test example: 5! = 120
        System.out.println("Factorial of 5 is: " + result);
    }
}
