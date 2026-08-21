package Leetcode;

public class LLReverseLL92 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    Node reverse_linkedList_v_two(int left, int right) {
        if (head.next == null || head == null || left == right) {
            return head;
        }
        Node temp = new Node(0);
        temp.next = head;

        // prev of prev
        Node prev = temp;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        // curr and nxt setting
        Node curr = prev.next;
        Node next;
        // reverse main
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return temp.next;
    }
}
