public class Palindrome {
     static void main() {
         String input = "madam";

         Deque<Character> deque = new LinkedList<>();

         for (int i = 0; i < input.length(); i++) {
             deque.addLast(input.charAt(i));
         }

         boolean isPalindrome = true;

         while (deque.size() > 1) {
             if (deque.removeFirst() != deque.removeLast()) {
                 isPalindrome = false;
                 break;
             }
         }

         System.out.println("Input String : " + input);
         System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}

