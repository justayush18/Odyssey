package Leetcode;

import java.util.Stack;

public class SimplifyString71 {

    static String simple(String path) {
        // split
        String[] str = path.split("/");
        Stack<String> stack = new Stack<>();
        // traverse this str ARRAY
        for (String i : str) {
            if (i.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!i.equals("") && !i.equals("..") && !i.equals(".")){
                stack.push(i);
            }
        }
        // now append / and after word
        StringBuilder sb = new StringBuilder();
        for (String i : stack){
            sb.append("/");
            sb.append(i);
        }
        return sb.isEmpty() ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        String str = "/home/";
        System.out.println(simple(str));
    }
}
