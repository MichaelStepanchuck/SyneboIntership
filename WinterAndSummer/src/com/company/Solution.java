package com.company;

import java.util.ArrayList;

public class Solution {

    public int solution(ArrayList<Integer> T){
        ArrayList<Integer> Winter = new ArrayList<>();
        boolean isWinter = true;

        for (int temp:T) {
            Winter.add(temp);
            for (int winTemp:Winter) {
                for (int i = Winter.size(); i<T.size(); i++)
                    if (winTemp>T.get(i)) {
                        isWinter=false;
                        break;
                }
            }
            if (isWinter) return Winter.size();
                else isWinter = true;
        }
        return Winter.size();
    }

}
