public class FactorialCalculator {
    public static void main(String[] args) {
        int n = 5; // You can change this value to calculate the factorial of a different number
        long factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    private static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
