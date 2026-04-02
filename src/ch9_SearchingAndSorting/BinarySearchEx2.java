package ch9_SearchingAndSorting;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchEx2 {
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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

        Arrays.sort(arr); // binary search needs sorted array
            System.out.print("Enter item to search: ");
            int target = sc.nextInt();

            if (binarySearch(arr, target))
                System.out.println("Item found");
            else
                System.out.println("Item not found");

            sc.close();
    }

}
