public class Find_Missing_number {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5 };
        System.out.println(missing(nums));

    }

    static int missing(int[] nums) {

        // n = array length
        int n = nums.length;

        
        int sum = 0;

        // Calculate sum of elements present in the array
        for (int num : nums) {
            sum += num;
        }

        // Calculate expected sum from 0 to n
        int expectedsum = n * (n + 1) / 2;

        // Expected sum - actual sum = missing number
        return expectedsum - sum;
    }

}
