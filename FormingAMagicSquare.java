import java.util.ArrayList;
import java.util.List;
public class FormingAMagicSquare {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        List<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(5);
        numbers1.add(8);
        List<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(6);
        numbers2.add(4);
        numbers2.add(2);
        List<List<Integer>> square = new ArrayList<>();
        square.add(numbers);
        square.add(numbers1);
        square.add(numbers2);
        System.out.println(getMinCost(square));

    }

    public static int getMinCost(List<List<Integer>> s) {
        int total = 0;
            int[][] squares = new int[][] {
                {8,3,4,1,5,9,6,7,2},
                {4,3,8,9,5,1,2,7,6},
                {8,1,6,3,5,7,4,9,2},
                {6,1,8,7,5,3,2,9,4},
                {2,9,4,7,5,3,6,1,8},
                {4,9,2,3,5,7,8,1,6},
                {2,7,6,9,5,1,4,3,8},
                {6,7,2,1,5,9,8,3,4}
            };
            
            int min = 50;
            for (int i = 0; i < squares.length; i++) {
                total = 0;
                for (int j = 0; j < squares[i].length; j++) {
                    total += Math.abs(s.get(j/3).get(j%3)-squares[i][j]);
                }
                if (total < min) min = total;
            }
            return min;
    }

}
