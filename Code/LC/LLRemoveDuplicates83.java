package Leetcode;

public class LLRemoveDuplicates83 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    Node removeDuplicate() {
        if (head == null) return null;

        Node slow = head;
        Node fast = head.next;

        while (fast != null) {
            if (slow.data == fast.data) {
                slow.next = fast.next;
            } else {
                slow = slow.next;
            }
            fast = fast.next;
        }

        return head;
    }
}
