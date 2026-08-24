import java.util.ArrayList;

public class spiralMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        // Result list to store spiral order
        ArrayList<Integer> ans = new ArrayList<>();

        // Direction:
        // 0 -> Left to Right
        // 1 -> Top to Bottom
        // 2 -> Right to Left
        // 3 -> Bottom to Top
        int dir = 0;

        // Matrix boundaries
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        // Continue while valid boundaries exist
        while (top <= bottom && left <= right) {

            // Direction 0: Left -> Right
            if (dir == 0) {

                for (int i = left; i <= right; i++) {
                    ans.add(arr[top][i]);
                }

                // Top boundary moves down
                top++;
            }

            // Direction 1: Top -> Bottom
            if (dir == 1) {

                for (int i = top; i <= bottom; i++) {
                    ans.add(arr[i][right]);
                }

                // Right boundary moves left
                right--;
            }

            // Direction 2: Right -> Left
            if (dir == 2) {

                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }

                // Bottom boundary moves up
                bottom--;
            }

            // Direction 3: Bottom -> Top
            if (dir == 3) {

                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }

                // Left boundary moves right
                left++;
            }

            // Move to next direction
            dir++;

            // Repeat directions after 3
            if (dir == 4) {
                dir = 0;
            }
        }

        // Print spiral order
       System.out.println(ans);
    }
}