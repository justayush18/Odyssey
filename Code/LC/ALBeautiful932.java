package Leetcode;

import java.util.ArrayList;

public class ALBeautiful932 {
    public ArrayList<Integer> beautiful(int n){
        ArrayList <Integer> res = new ArrayList<>();
        res.add(1);

        while(res.size() < n){
            ArrayList <Integer> temp = new ArrayList<>();
            //odd number
            for (int i : res){
                if ((2*i)-1 <= n){
                    temp.add((2*i)-1);
                }
            }
            // even
            for (int i : res){
                if (2*i <= n){
                    temp.add(2*i);
                }
            }
            res = temp;
        }
        return res;
    }
    public int[] beautifulArray(int n) {
        ArrayList <Integer> res = new ArrayList<>();
        res.add(1);
        while(res.size() < n){
            ArrayList <Integer> temp = new ArrayList<>();
            //odd
            for (int i : res){
                if (2*i-1 <= n){
                    temp.add(2*i-1);
                }
            }
            //even
            for (int i : res){
                if (2*i <= n){
                    temp.add(2*i);
                }
            }
            res = temp;
        }
        int[] finalAnswer = new int[n];
        for (int i : res){
            finalAnswer[i] = res.get(i);
        }
        return finalAnswer;
    }
    public static void main(String[] args) {
        ALBeautiful932 alBeautiful932 = new ALBeautiful932();
        ArrayList <Integer> ans = alBeautiful932.beautiful(5);
        System.out.println(ans);
    }
}
