public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Convert string to character array
        char[] arr = input.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}