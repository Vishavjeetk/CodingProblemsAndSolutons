//Calculating gcd and lcm of two numbers

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int gcd = gcd(number1, number2);
        int lcm = lcm(number1, number2);
        System.out.println("Gcd: " + gcd);
        System.out.println("Lcm: " + lcm);
        sc.close();
    }

    public static int gcd(int a, int b) {
        int rem;
        while (a % b != 0) {
            rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (a * b) / gcd;
    }
}
