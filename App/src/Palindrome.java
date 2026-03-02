public class Palindrome {
     static void main() {
         String input = "madam";

         Queue<Character> queue = new LinkedList<>();
         Stack<Character> stack = new Stack<>();

         for (int i = 0; i < input.length(); i++) {
             char ch = input.charAt(i);
             queue.add(ch);
             stack.push(ch);
         }

         boolean isPalindrome = true;

         while (!queue.isEmpty()) {
             if (queue.remove() != stack.pop()) {
                 isPalindrome = false;
                 break;
             }
         }

         System.out.println("Input String : " + input);
         System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}

