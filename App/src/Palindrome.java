public class Palindrome {
     static void main() {
         String input = "level";

         System.out.println("Input : " + input);
         System.out.println();

         long startTime = System.nanoTime();
         boolean result1 = twoPointerCheck(input);
         long endTime = System.nanoTime();

         System.out.println("Two Pointer Result : " + result1);
         System.out.println("Execution Time     : " + (endTime - startTime) + " ns");
         System.out.println();

         startTime = System.nanoTime();
         boolean result2 = stackCheck(input);
         endTime = System.nanoTime();

         System.out.println("Stack Result       : " + result2);
         System.out.println("Execution Time     : " + (endTime - startTime) + " ns");
         System.out.println();

         startTime = System.nanoTime();
         boolean result3 = reverseCheck(input);
         endTime = System.nanoTime();

         System.out.println("Reverse Result     : " + result3);
         System.out.println("Execution Time     : " + (endTime - startTime) + " ns");
     }

    public static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackCheck(String input) {
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

    public static boolean reverseCheck(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }
}
