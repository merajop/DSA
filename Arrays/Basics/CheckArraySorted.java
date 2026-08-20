
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};

        boolean check=true;
        // Check whether array is sorted or not
        int[] arr = {1, 2, 3, 4, 5};

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                check=false;
                break;
        for (int i = 1; i < arr.length; i++) {

            // Current element should be >= previous element
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if(check){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("not sorted");
        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}