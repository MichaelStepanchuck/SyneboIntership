package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int squareDigitsCount = 0;
        int StartOfSequence;
        int EndOfSequence;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Write start of sequence: ");
            StartOfSequence = scan.nextInt();
            System.out.print("Write end of sequence: ");
            EndOfSequence = scan.nextInt();


            if (StartOfSequence <= EndOfSequence) {
                for (int i = StartOfSequence; i <= EndOfSequence; i++) if (Math.sqrt(i) % 1 == 0) squareDigitsCount++;
                System.out.println("Count of whole square: " + squareDigitsCount);
            } else System.out.println("Start of sequence bigger than end of sequence");

            System.out.print("Do you want to repeat? Y/N: ");

            if (!scan.next().equals("Y")) break;
            else squareDigitsCount = 0;

        }
    }
}
