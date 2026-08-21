package Leetcode;

public class LLSwap1721 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    // brute force approach

    public Node swapLC(int k) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size == 0 || k > size) return null;

        int[] arr = new int[size];
        int i = 0;
        Node temp2 = head;
        while (temp2 != null) {
            arr[i] = temp2.data;
            i++;
            temp2 = temp2.next;
        }

        // swap
        int temp3 = arr[k - 1];
        arr[k - 1] = arr [size - k];
        arr [size - k] = temp3;

        // copy arr element -> to LL
        int i2 = 0;
        Node temp4 = head;
        while (temp4 != null){
            temp4.data = arr[i2];
            i2++;
            temp4 = temp4.next;
        }
        return head;
    }

    //optimal

    Node swapLC2(int k){
        Node first = head;

        for (int i = 1; i < k; i++){
            first = first.next;
        }

        Node sec = head;
        Node temp = first;

        while (temp.next != null){
            temp = temp.next;
            sec = sec.next;
        }

        int temp2 = first.data;
        first.data = sec.data;
        sec.data = temp2;

        return head;
    }
}