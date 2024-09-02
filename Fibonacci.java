import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = fibonacciMemoized(number, new int[number + 1]);
        System.out.println(result);
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // In this code fibonacci of same numbers is getting calculated multiple times
        // so we need more efficient solution.
        System.out.println(n);
        int fib1 = fibonacci(n - 1);
        int fib2 = fibonacci(n - 2);
        return fib1 + fib2;
    }

    // We will use memoization i.e we will use a data type that will store the
    // result of fibonnaci of previous numbers.

    public static int fibonacciMemoized(int n, int[] storage) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (storage[n] != 0) {
            return storage[n];
        }
        System.out.println(n);
        int fib1 = fibonacciMemoized(n - 1, storage);
        int fib2 = fibonacciMemoized(n - 2, storage);
        storage[n] = fib1 + fib2;
        return fib1 + fib2;
    }
}
