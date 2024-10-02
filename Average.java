import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        
        // Input the 5 numbers
        for (int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }
        
        // Input limit1 and limit2
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        
        int count = 0;
        int sum = 0;
        
        // Loop to find numbers between limit1 and limit2
        for (int i = 0; i < 5; i++) {
            if (number[i] > limit1 && number[i] < limit2) {
                sum += number[i];
                count++;
            }
        }
        
        // Check if count is greater than 0 to avoid division by zero
        if (count > 0) {
            int average = sum / count;
            System.out.println(average);
        } else {
            System.out.println("No numbers in the specified range.");
        }
    }
}
