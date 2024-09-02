/* There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

1. The elements of the first array are all factors of the integer being considered
2. The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist. */

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = hashSetWithRandomIntegers(3);
        Set<Integer> set2 = hashSetWithRandomIntegers(4);
        betweenTwoSetSolution(set1, set2);
        sc.close();
    }

    public static Set<Integer> hashSetWithRandomIntegers(int n) {
        Random random = new Random();
        Set<Integer> intSet = new HashSet<>();
        while (n-- > 0) {
            intSet.add(random.nextInt(100) + 1);
        }
        System.out.println(intSet);
        return intSet;
    }

    public static int betweenTwoSetSolution(Set<Integer> set1, Set<Integer> set2) {

        return 1;
    }
}
