public class Palindrome {
     static void main() {
         String input = "madam";

         Stack<Character> stack = new Stack<>();

         for (int i = 0; i < input.length(); i++) {
             stack.push(input.charAt(i));
         }

         boolean isPalindrome = true;

         for (int i = 0; i < input.length(); i++) {
             if (input.charAt(i) != stack.pop()) {
                 isPalindrome = false;
                 break;
             }
         }

         System.out.println("Input String : " + input);
         System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}

