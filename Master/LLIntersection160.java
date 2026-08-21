package Leetcode;

public class LLIntersection160 {
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

    int lengthOf(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    Node intersection(Node headA, Node headB) {
        int l1 = lengthOf(headA);
        int l2 = lengthOf(headB);

        int d;

        Node p1;
        Node p2;

        if (l1 > l2) {
            d = l1 - l2;
            p1 = headA;
            p2 = headB;
        } else {
            d = l2 - l1;
            p1 = headB;
            p2 = headA;
        }

        while (d != 0) {
            p1 = p1.next;
            if (p1 == null) {
                return null;
            }
            d--;
        }

        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }
}
