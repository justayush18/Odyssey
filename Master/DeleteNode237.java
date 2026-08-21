package Leetcode;

public class DeleteNode237 {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    public static ListNode head;

    public void deleteNode(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
