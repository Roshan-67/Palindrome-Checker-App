public class Palindrome {
     static void main() {
         String input = "Madam In Eden Im Adam";

         PalindromeChecker checker = new PalindromeChecker();

         boolean result = checker.checkPalindrome(input);

         System.out.println("Input String : " + input);
         System.out.println("Is it a Palindrome? : " + result);
     }
}
class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
