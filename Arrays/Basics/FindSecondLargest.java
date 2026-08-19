package Arrays.Basics;
// Pattern: Single Traversal
// Idea: Maintain two variables — largest and secondLargest
// Update secondLargest whenever a new largest is found or
// the current element lies between largest and secondLargest.
// Time: O(n) | Space: O(1)

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 45, 32, 32, 3 };

        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }

            if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }

        System.out.print("The second largest element in this array : " + secondlargest);

    }

}
