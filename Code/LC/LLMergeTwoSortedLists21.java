package Leetcode;

public class LLMergeTwoSortedLists21 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    Node merge(Node l1, Node l2){
        Node dummy = new Node(0);
        Node curr = dummy;

        while (l1 != null && l2 != null){
            if (l1.data <= l2.data){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) curr.next =l1;
        else curr.next = l2;

        return dummy.next;
    }
}
