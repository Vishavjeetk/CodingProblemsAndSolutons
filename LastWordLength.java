import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "Hello World";
        int result = lengthOfLastWordSolution(string);
        System.out.println(result);
        sc.close();
    }
    public static int lengthOfLastWordSolution(String s) {
        int counter = 0;
        int previousCount = 0;
        boolean start = false;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == ' ') {
                if (start == true) break;
                counter = 0;
                continue;
            }
            start = true;
            counter++;
            previousCount = counter;
        }
        return previousCount;
    }
}
