
/**
 * Problem:
 * Find all the leaders in an array.
 *
 * The last element is always considered a leader because
 * there is no element to its right.
 *
 * Approach:
 * - Traverse the array from right to left.
 * - Keep track of the maximum element seen so far.
 * - If the current element is greater than max, it is a leader.
 * - Update max with the current element.
 *
 * Example:
 * Input:  [2, 3, 5, 4, 1]
 * Output: 1 4 5
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class leadersInArray {

    public static void main(String[] args) {

        int[] nums = {2, 3, 5, 4, 1};

        // Last element is always a leader
        int max = nums[nums.length - 1];
        System.out.println(max);

        // Traverse from right to left
        for (int i = nums.length - 2; i >= 0; i--) {

            // Current element is greater than all elements to its right
            if (nums[i] > max) {
                System.out.println(nums[i]);

                // Update maximum
                max = nums[i];
            }
        }
    }
}

