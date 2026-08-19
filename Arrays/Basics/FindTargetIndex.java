
// Pattern: Linear Search
// Idea: Traverse the array one by one and compare each element with the target.
// If target is found, return its index; otherwise return -1.
// Time: O(n) | Space: O(1)

public class FindTargetIndex {
    static void main(String[] args) {
        int[] arr = {2, 9, 2, 3, 7, 6, 1};
        System.out.println(Targetno(arr,1));

    }

    static int Targetno(int[] arr, int target) {

        int element=0;
        for (int i = 0; i < arr.length; i++) {
            element = arr[i];

            if (element == target) {

                return i;
            }
        }
        return -1;

    }
}