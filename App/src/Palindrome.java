public class Palindrome {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
     static void main() {
         String input = "madam";

         Node head = null, tail = null;

         for (int i = 0; i < input.length(); i++) {
             Node newNode = new Node(input.charAt(i));
             if (head == null) {
                 head = newNode;
                 tail = newNode;
             } else {
                 tail.next = newNode;
                 tail = newNode;
             }
         }

         boolean isPalindrome = isPalindrome(head);

         System.out.println("Input String : " + input);
         System.out.println("Is it a Palindrome? : " + isPalindrome);

     }
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node current = slow;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        Node firstHalf = head;
        Node secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}

