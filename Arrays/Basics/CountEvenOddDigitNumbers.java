
public class  CountEvenOddDigitNumbers{

    public static void main(String[] args) {

        int[] nums = { 11, 236, 2, 333, 21, 233 };

        System.out.println("Count of Even Digit Numbers: " + countEven(nums));
        System.out.println("Count of Odd Digit Numbers: " + countOdd(nums));
    }

    // Counts how many numbers have an even number of digits
    static int countEven(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }

        return count;
    }

    // Checks whether the number has an even number of digits
    static boolean hasEvenDigits(int num) {
        int numberOfDigits = countDigits(num);

        return numberOfDigits % 2 == 0;
    }

    // Counts the number of digits in a number
    static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    // Counts how many numbers have an odd number of digits
    static int countOdd(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (hasOddDigits(num)) {
                count++;
            }
        }

        return count;
    }

    // Checks whether the number has an odd number of digits
    static boolean hasOddDigits(int num) {
        int numberOfDigits = countDigits(num);

        return numberOfDigits % 2 != 0;
    }
}