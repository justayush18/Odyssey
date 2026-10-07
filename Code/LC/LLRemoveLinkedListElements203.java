package Leetcode;

public class LLRemoveLinkedListElements203 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    Node removeElements(int val){
        if (head == null){
            return null;
        }
        Node dum = new Node (0);
        dum.next = head;

        Node temp = dum;
        while (temp.next != null) {
            if (temp.next.data == val) {
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        }
        return dum.next;
    }
}
