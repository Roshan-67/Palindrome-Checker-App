public class Palindrome {
     static void main() {
         String input = "Madam In Eden Im Adam";

         String normalized = input.replaceAll("\\s+", "").toLowerCase();

         int start = 0;
         int end = normalized.length() - 1;
         boolean isPalindrome = true;

         while (start < end) {
             if (normalized.charAt(start) != normalized.charAt(end)) {
                 isPalindrome = false;
                 break;
             }
             start++;
             end--;
         }

         System.out.println("Original String  : " + input);
         System.out.println("Normalized String: " + normalized);
         System.out.println("Is it a Palindrome? : " + isPalindrome);
     }
}
