public class maxConsecutive_Ones {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 8, 1, 1, 1, 1, 1 };

        System.out.println(countmaxones(arr));

    }

    static int countmaxones(int[] arr) {

          // Stores the maximum consecutive 1s found so far
        int maxones = 0;


        // Stores the current consecutive 1s count
        int count = 0;

        // traverse array
        for (int i = 0; i < arr.length; i++) {

            // Check element is 1
            if (arr[i] == 1) {

                  // Increase the current consecutive count
                count++;

                  // Update maximum consecutive 1s
                maxones = Math.max(maxones, count);

            }
            // consecutives seq breaks reset count
            else {
                count = 0;
            }
        }
        return maxones;
    }
}
