package Leetcode;

public class RotateList61 {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    public static ListNode head;

    ListNode rotate(int k){
        if (k == 0 || head == null || head.next == null) return head;

        int size = 1;
        ListNode tail = head;

        // One loop, two jobs with tail.next not tail != null;
        while(tail.next != null){
            tail = tail.next;
            size++;
        }

        k = k % size;
        // if ans of step is 0 so return as it is
        if (k == 0) return head;

        tail.next = head;

        int step = size - k;
        ListNode newTail = head;

        for (int i = 1; i < step; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
    public static void main(String[] args) {

    }
}
