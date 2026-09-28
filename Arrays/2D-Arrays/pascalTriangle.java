
import java.util.ArrayList;

public class pascalTriangle {

    public static void main(String[] args) {

        int numrow = 3;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numrow; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            // Row ke saare elements initially 1
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }

            // Middle elements calculate
            for (int j = 1; j < i; j++) {
                row.set(j,
                    result.get(i - 1).get(j)
                    + result.get(i - 1).get(j - 1)
                );
            }

            // Current row ko result me add karo
            result.add(row);
        }

        System.out.println(result);

        System.out.println(result.get(1));

        System.out.println(result.get(2).get(1));
    }
}
    

