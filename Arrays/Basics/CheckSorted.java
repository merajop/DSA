public class CheckSorted {

    public static void main(String[] args) {

        // Check whether array is sorted or not
        int[] arr = {1, 2, 3, 4, 5};

        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {

            // Current element should be >= previous element
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}