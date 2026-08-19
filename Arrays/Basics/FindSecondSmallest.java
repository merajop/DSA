

// Pattern: Single Traversal
// Idea: Maintain the smallest and second smallest elements while traversing the array.
// Time: O(n) | Space: O(1)

public class FindSecondSmallest {

    public static void main(String[] args) {
        int[] arr = { 101, 104, 102, 103, 109 };

        int smallest = arr[0];

        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }

            if (arr[i] > smallest && arr[i] < secondSmallest) {

                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest Number is this array : " + secondSmallest);

    }

}
