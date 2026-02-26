public class PalindromeCheckerApp {
    public static void main () {
        String input= "madam";
        boolean isPalindrome = true;
        int n = input.length() - 1;
        for (int i = 0; i < word.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
        {
            System.out.println(input + " Is a Palindrome. ");
        }
        else {
            System.out.println(input + " Is not a palindrome ");
        }
    }
}