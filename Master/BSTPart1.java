package Leetcode;

import java.util.*;

public class BSTPart1 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            right = left = null;
        }
    }

    Node build(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = build(root.left, val);
        } else {
            root.right = build(root.right, val);
        }

        return root;
    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        // left->root->right
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    boolean search(Node root, int target) {
        //base
        if (root == null) {
            return false;
        }
        if (target == root.data) {
            return true;
        }
        if (target < root.data) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }
    }

    Node delete(Node root, int val) {
        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            // case 1: leaf node
            if (root.left == null && root.right == null) return null;
            // case 2: one child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            //case 3: two child
            Node is = findInorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, val);
        }
        return root;
    }

    Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    void range(Node root, int n1, int n2) {
        if (root == null) {
            return;
        }

        //case1 root > n1 and root < n2 means in between both n1 n2
        if (root.data >= n1 && root.data <= n2) {
            range(root.left, n1, n2);
            System.out.print(root.data + " ");
            range(root.right, n1, n2);
        }
        //case 2: value lie in right subtree only
        else if (root.data < n1) {
            range(root.right, n1, n2);
        }
        //case 3: value lie in left subtree also
        else {
            range(root.left, n1, n2);
        }
    }

     void printPath(Node root, ArrayList<Integer> path){
        //base case
        if (root == null) return;
        // add node value
        path.add(root.data);
        // if we are at leaf so print whole path
        if (root.right ==null && root.left == null){
            System.out.println(path);
        }
        printPath(root.right, path);
        printPath(root.left, path);
        // remove last because possibility of other same path but with diff leaf
         // node either right or left
        path.removeLast();
     }

     boolean isBst(Node root, Node min, Node max){
        if (root == null) return true;
        if (min != null && root.data <= min.data) return false;
        if (max != null && root.data >= max.data) return false;
        return isBst(root.left, min, root) && isBst(root.right, root, max);
     }

     Node mirror(Node root){
        if (root == null) return null;

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
     }

    public static void main(String[] args) {
        BSTPart1 bst = new BSTPart1();
        int[] node = {7, 2, 10, 4, 1, 9, 6, 3, 8, 5};
        Node root = null;

        for (int i : node) {
            root = bst.build(root, i);
        }

        //bst.inOrder(root);

        //search a node
        //System.out.println(bst.search(root, 5));

        // delete node with 3 cases
//        bst.delete(root, 5);
//        bst.inOrder(root);

        //print in range
        //bst.range(root, 5, 10);   // Correct version

        //root to leaf path
        //bst.printPath(root, new ArrayList<>());

        //validate BST
        //System.out.println(bst.isBst(root, null, null));

        //mirror BST
        //System.out.println(bst.mirror(root).data);
    }
}
