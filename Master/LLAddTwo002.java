package Leetcode;

public class LLAddTwo002 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //public static ListNode head;

    Node addTwoNum(Node l1, Node l2){
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry =0;

        while(l1 != null || carry != 0 || l2 != null){
            int sum = carry;
            if (l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }
}
