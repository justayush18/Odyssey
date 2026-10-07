package Leetcode;

public class GBalancedSplit1221 {

    static int balanced(String s){
        int ans = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if ('L' == ch){
                l++;
            }
            else{
                l--;
            }
            if (l == 0){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "LRRRRLLRLLRL";
        System.out.println(balanced(s));
    }
}
