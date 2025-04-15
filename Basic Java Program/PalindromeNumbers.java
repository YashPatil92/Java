class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 1 to 100:");

        for (int no=1;no<=100;no++) {
            if (isPalindrome(no)) {
                System.out.print(no + " ");
            }
        }
    }

    // Function to check if a number is a palindrome

    public static boolean isPalindrome(int no) {
        int org = no;
        int reverse = 0;

        while (no>0) {
            int digit=no%10;     	 // Extract the last digit
            reverse=reverse*10+digit;    // Build the reversed number
            no=no/10;                    // Remove the last digit
        }

        return original == reverse;      // Check if original matches the reverse
    }
}
