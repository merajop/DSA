
public class CountEven_Odd_Numbers {

    public static void main(String[] args) {
        int[] nums = { 11, 1, 20, 3, 23, 10 };

        int even = 0;
        int odd = 0;

        // Traverse every element
        for (int num : nums) {

            // Even number → remainder is 0
            if (num % 2 == 0) {
                even++;
            }

            // Otherwise number is odd
            else {
                odd++;
            }

        }
        System.out.println("Count Of even Numbers : " + even);
        System.out.println("Count Of Odd Numbers : " + odd);

    }

}
