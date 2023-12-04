public class FactorialCalculator {

    // This program calculates the factorial of a number 
    // that is passed to the program by command line argument
    public static void main(String[] args) {
        System.out.println("Factorial of " + args[0] + " is: " + factorial(Integer.parseInt(args[0])));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i < n; i++) {
            result *= i;
        }
        return result;
    }
}
