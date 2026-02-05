package Day2_Searching;

class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int key = 40;

        int low = 0;
        int high = arr.length - 1;
        int mid;
        int index = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}


