package Leetcode;

import java.util.LinkedList;
import java.util.Queue;
public class Dota2Senate649 {
    static String predictPartyVictory(String senate) {
        int n = senate.length();

        Queue <Integer> rq = new LinkedList<>();
        Queue <Integer> dq = new LinkedList<>();

        for (int i =0; i < n; i++){
            if (senate.charAt(i) == 'R') rq.add(i);
            else dq.add(i);
        }

        while (!rq.isEmpty() && !dq.isEmpty()){
            int ri = rq.remove(), di = dq.remove();
            if (ri < di){
                rq.add(n+ri);
            } else{
                dq.add(n+di);
            }
        }
        return rq.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        String str = "RDD";
        System.out.println(predictPartyVictory(str));
    }
}
