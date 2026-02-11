package SortingAlgo;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {25, 29, 117, 19, 289, 24};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i;   // Assume current index is minimum

            // Find actual minimum in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap only once after inner loop
            if (min != i) {   // Optimization: avoid unnecessary swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

