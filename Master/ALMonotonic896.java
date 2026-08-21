package Leetcode;

import java.util.ArrayList;

public class ALMonotonic896 {
    //[1 2 3]
    public static boolean isMonotonic(ArrayList<Integer> num) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 0; i < num.size() - 1; i++) {

            int current = num.get(i);
            int next = num.get(i + 1);

            if (current > next) {
                isIncreasing = false;
            }

            if (current < next) {
                isDecreasing = false;
            }
        }
        return isDecreasing || isIncreasing;
    }

    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(isMonotonic(num));


    }
}
