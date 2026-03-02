public class Palindrome {
     static void main() {
         String input = "madam";

         boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

         System.out.println("Input String : " + input);
         System.out.println("Is it a Palindrome? : " + isPalindrome);
     }

    public static boolean checkPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkPalindrome(str, start + 1, end - 1);
    }
}
