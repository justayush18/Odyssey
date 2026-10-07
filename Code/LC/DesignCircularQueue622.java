package Leetcode;

public class DesignCircularQueue622 {
    static class  MyCircularQueue {
        int rear;
        int front;
        int size;
        int[] arr;

        MyCircularQueue(int k) {
            rear = -1;
            front = -1;
            this.size = k;
            arr = new int[k];
        }

        boolean isEmpty() {
            return rear == -1 & front == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        boolean enQueue(int value) {
            if (isFull()) return false;
            if (front == -1) front = 0;

            rear = (rear + 1) % size;
            arr[rear] = value;
            return true;
        }

        boolean deQueue() {
            if (isEmpty()) return false;

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return true;
        }

        int Front() {
            if (isEmpty()) return -1;
            return arr[front];
        }

        int Rear() {
            if (isEmpty()) return -1;
            return arr[rear];
        }

    }

    public static void main(String[] args) {
        MyCircularQueue c = new MyCircularQueue(3);
        System.out.println(c.Front());
    }
}
