import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of discs: ");
        int discs = scanner.nextInt();
        towerOfHanoi(discs, 'A', 'B', 'C');
        scanner.close();
    }
    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 0) {
            return;
        }

        towerOfHanoi(n-1, from, aux, to);
        System.out.println(n + ": " + from + " -> " + to);
        towerOfHanoi(n-1, aux, to, from);

    }
}