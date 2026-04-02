package ch9_SearchingAndSorting;

public class BinarySearchEx1 {
    public static boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                    return true;
            else if (target < arr[mid])
                    high = mid - 1;
            else
                    low = mid + 1;
            }
            return false;
        }
        public static void main(String[] args) {
            int[] list = {10, 21, 64, 88, 98};

            if (binarySearch(list, 98))
                System.out.println("Item found");
            else
                System.out.println("Item not found");
        }
}
