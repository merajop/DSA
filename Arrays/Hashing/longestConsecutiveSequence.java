import java.util.HashSet;

/**
 * Problem:
 * Find the length of the longest consecutive sequence.
 *
 * Approach:
 * - Store all elements in a HashSet for O(1) average lookup.
 * - A number is the start of a sequence if (num - 1) is not present.
 * - From that number, keep checking consecutive elements.
 *
 * Example:
 * Input:  [1, 4, 5, 3, 102, 101, 100, 2]
 * Output: 5
 *
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 */

public class longestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 102, 101, 100, 2};

        HashSet<Integer> hash = new HashSet<>();

        // Store all elements in HashSet
        for (int num : arr) {
            hash.add(num);
        }

        int longestStreak = 0;

        // Check each possible starting point
        for (int num : arr) {

            if (!hash.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

                // Find the complete consecutive sequence
                while (hash.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        System.out.println(longestStreak);
    }
}
