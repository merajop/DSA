public class removeDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        // i = last unique element
        int i = 0;

        // j = traverses the array
        for (int j = 1; j < arr.length; j++) {

            // Found a new unique element
            if (arr[i] != arr[j]) {
                i++;

                // Place unique element at next position
                arr[i] = arr[j];
            }
        }

        // i is index, so count = i + 1
        System.out.println(i + 1);
    }
}