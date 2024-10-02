import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int findMissingPositive(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        
        // Collect all positive numbers and find the maximum
        for (int i : arr) {
            if (i > 0) {
                list.add(i);
                max = Math.max(max, i);
            }
        }

        // Find the smallest missing positive number
        for (int i = 1; i <= max; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }

        // If all numbers are present, return max + 1
        return max+1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("Smallest missing positive number is: " + findMissingPositive(arr));
    }
}
