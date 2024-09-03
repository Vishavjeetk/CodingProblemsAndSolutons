import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = reverse(number);
        System.out.println(result);
        sc.close();
    }

    public static int reverse(int n) {
        int temp = n;
        int reverse = 0;
        while (temp != 0) {
            int modulo = temp % 10;
            reverse = (reverse * 10) + modulo;
            temp /= 10;
        }
        return reverse;
    }

}
