package Leetcode;

public class Sandwich1700 {

    static int remainStudents(int[] students, int[] sandwiches){
        int zero = 0, one = 0;
        for (int student : students){
            if (student == 0) zero++;
            else one++;
        }

        for (int sandwich : sandwiches){
            if (sandwich == 0 && zero == 0) return one;
            if (sandwich == 1 && one == 0) return zero;

            if (sandwich == 0) zero--;
            else one--;
        }
        return 0;
    }
}
