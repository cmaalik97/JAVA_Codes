package ch9_SearchingAndSorting;
import java.util.Scanner;

public class LinearSearchEx2 {
    public static boolean linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] list = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
                list[i] = sc.nextInt();
            }

            System.out.print("Enter item to search: ");
            int target = sc.nextInt();

            if (linearSearch(list, target))
                System.out.println("Item found");
            else
                System.out.println("Item not found");

            sc.close();

    }
}
