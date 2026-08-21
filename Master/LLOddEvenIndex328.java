package Leetcode;

public class LLOddEvenIndex328 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    Node indexArrange(){
        Node odd = head;
        Node even = head.next;
        Node evenH = even;

        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        return odd.next = evenH;
    }
}
