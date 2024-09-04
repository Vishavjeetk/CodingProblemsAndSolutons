import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var result = twoSum(new int[] { 1, 2, 3, 4, 5 }, 9);
        for (int item:result) {
            System.out.println(item);
        }
        sc.close();
    }

    public static int[] twoSum(int[] a, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < a.length; ++i) {
            if (hashMap.containsKey(target - a[i])) {

                return new int[] { hashMap.get(target - a[i]), i };
            }
            hashMap.put(a[i], i);
        }
        throw new IllegalArgumentException();
    }

}
