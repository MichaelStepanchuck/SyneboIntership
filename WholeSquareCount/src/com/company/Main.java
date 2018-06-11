package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Solution solutionObj = new Solution();

        int StartOfSequence;
        int EndOfSequence;
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Write start of sequence: ");
                StartOfSequence = scan.nextInt();
                System.out.print("Write end of sequence: ");
                EndOfSequence = scan.nextInt();
                System.out.println("Whole Square Count: "+ solutionObj.solution(StartOfSequence,EndOfSequence));
            } catch (InputMismatchException e){
                System.out.println("Start Of Sequence and End Of Sequence are integers within the range [−2,147,483,648..2,147,483,647];");
            }

            System.out.print("Do you want to repeat? Y/N: ");
            if (!scan.next().equals("Y")) break;


        }
    }
}
