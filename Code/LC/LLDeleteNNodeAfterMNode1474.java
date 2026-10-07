package Leetcode;

public class LLDeleteNNodeAfterMNode1474 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    Node deleteNNodeAfterMNode(int m, int n) {
        // list is empty
        if (head == null) {
            return null;
        }
        // it means you are deleting whole list
        if (m == 0) {
            return null;
        }

        Node curr = head;
        while (curr != null) {
            for (int i = 1; i < m && curr != null; i++){
                curr = curr.next;
            }
            if (curr == null){
                break;
            }
            Node temp = curr.next;
            for (int i = 0; i < n && temp != null; i++){
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
        return head;
    }
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LLDeleteNNodeAfterMNode1474 ll = new LLDeleteNNodeAfterMNode1474();
        Node nn = new Node(10);
        Node nn2 = new Node(20);
        Node nn3 = new Node(30);
        Node nn4 = new Node(40);
        Node nn5 = new Node(50);
        Node nn6 = new Node(60);

        head = nn;
        nn.next = nn2;
        nn2.next = nn3;
        nn3.next = nn4;
        nn4.next = nn5;
        nn5.next = nn6;

        ll.deleteNNodeAfterMNode(2, 2);
        ll.print();
    }
}
