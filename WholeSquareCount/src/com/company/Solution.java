package com.company;

public class Solution {
    public int solution(int a, int b){
        int squareDigitsCount = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) if (Math.sqrt(i) % 1 == 0) squareDigitsCount++;
        } else System.out.println("Start of sequence bigger than end of sequence");
        return  squareDigitsCount;
    }
}
