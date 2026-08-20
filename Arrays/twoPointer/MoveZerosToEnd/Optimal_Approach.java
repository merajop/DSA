package Arrays.twoPointer.MoveZerosToEnd;

import java.util.Arrays;

public class Optimal_Approach {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, 0, 5, 6 };

        int i = 0; // non-zero ki next position

        
        for (int j = 0; j < arr.length; j++) {     // j = scans the complete array

            if (arr[j] != 0) {         // non-zero mila

                swap(arr, i, j);        // non-zero ko i par lao

                i++;            // next position

            }

        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
