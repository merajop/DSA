
import java.util.ArrayList;
import java.util.Arrays;

public class Better_Approach {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 0, 1, 5, 0, 2 };

        ArrayList<Integer> list = new ArrayList<>();

        // Store all non-zero elements
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }
        // Copy non-zero elements back into the array
        for (int i = 0; i < list.size(); i++) {

            arr[i] = list.get(i);
        }
        // Fill remaining positions with zero
        for (int j = list.size(); j < arr.length; j++) {
            arr[j] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

}
