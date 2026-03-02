public class Palindrome {
     static void main() {
         String input = "level";

         PalindromeStrategy strategy = new StackStrategy();

         boolean result = strategy.check(input);

         System.out.println("Input : " + input);
         System.out.println("Is Palindrome? : " + result);
     }
}
interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Deque<Character> deque = new java.util.LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}
