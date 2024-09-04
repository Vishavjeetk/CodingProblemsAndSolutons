import java.util.Scanner;
import java.util.ArrayList;

public class GetStairsPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> path = getStairsPath(n);
        System.out.println(path);
        scanner.close();
    }

    public static ArrayList<String> getStairsPath(int n) {

        if (n == 0) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        if (n < 0) {
            return new ArrayList<String>();
        }

        ArrayList<String> path1 = getStairsPath(n - 1);
        ArrayList<String> path2 = getStairsPath(n - 2);
        ArrayList<String> path3 = getStairsPath(n - 3);
        ArrayList<String> paths = new ArrayList<String>();

        for (String item : path1) {
            paths.add("1" + item);
        }
        for (String item : path2) {
            paths.add("2" + item);
        }
        for (String item : path3) {
            paths.add("3" + item);
        }

        return paths;
    }

}
