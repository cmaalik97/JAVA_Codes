package ch9_SearchingAndSorting;

public class LinearSearchEx1 {
    public static boolean linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                    return true;
                }
            }
            return false;
        }
   public static void main(String[] args) {
            int[] list = {10, 43, 21, 64, 78, 42, 98, 65, 29, 71};

            if (linearSearch(list, 65))
                System.out.println("Item found");
            else
                System.out.println("Item not found");

   }
}
