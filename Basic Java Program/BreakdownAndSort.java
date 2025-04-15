import java.util.Arrays;

public class BreakdownAndSort {
    public static void main(String[] args) {
        int number = 1436; // Input number
        String numStr = Integer.toString(number); // Convert number to String
        
        // Create an array to hold the digits
        int[] digits = new int[numStr.length()];
        
        // Extract digits from the number
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        
        // Sort the digits in ascending order
        Arrays.sort(digits);
        
        // Print the sorted digits
        System.out.print("Sorted Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }
}
