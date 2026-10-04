package Arrays.Hashing;


import java.util.HashMap;

/**
 * Problem:
 * Find two elements whose sum is equal to the target
 * and print their indices.
 *
 * Approach:
 * For every element, calculate the number we need:
 *
 * need = target - current element
 *
 * Store each number with its index in a HashMap.
 * HashMap gives fast lookup to check whether 'need' already exists.
 *
 * Example:
 * nums = [2, 3, 5, 6, 7, 8]
 * target = 10
 *
 * 3 + 7 = 10
 * Output: 1 4
 *
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 * 
 *  IF ARRAY IS SORTED U CAN GO WITH TWO POINTER APPROACH
 */

public class twoSumBetter {

    public static void main(String[] args) {

        int[] nums = {2, 3, 5, 6, 7, 8};
        int target = 10;

        // Store: number -> index
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Find the number required to make the target
            int need = target - nums[i];

            // Check if the required number was already seen
            if (hash.containsKey(need)) {

                // Print index of required number and current index
                System.out.println(hash.get(need) + " " + i);
                break;
            }

            // Store current number with its index
            hash.put(nums[i], i);
        }
    }
}

