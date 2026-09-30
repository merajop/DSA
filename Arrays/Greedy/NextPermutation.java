public class NextPermutation {

static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int n = arr.length;

        int golaindex = -1;

        // Step 1: Find breakpoint
        for(int i = n - 1; i >= 0; i--) {

            if(arr[i] > arr[i - 1]) {
                golaindex = i - 1;
                break;
            }
        }

        // Step 2: Find element to swap
        if(golaindex != -1) {

            int swapindex = golaindex;

            for(int j = n - 1; j > golaindex; j--) {

                if(arr[j] > arr[golaindex]) {
                    swapindex = j;
                    break;
                }
            }

            // Step 3: Swap
            swap(arr, golaindex, swapindex);
        }

        // Step 4: Reverse
        reverse(arr, golaindex + 1, n - 1);

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}

