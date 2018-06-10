package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Solution solutionObj = new Solution();
        ArrayList<Integer> monitoring = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int NewElement;

        while (true) {

            try {
                NewElement = scanner.nextInt();
                if (!(NewElement<-1000000000 || NewElement>1000000000)) {
                    monitoring.add(NewElement);
                } else System.out.println("Each element of array T is an integer within the range [−1,000,000,000..1,000,000,000]");
            } catch (InputMismatchException e) {
                System.out.println("Each element of array T is an integer within the range [−1,000,000,000..1,000,000,000]");
            }

            System.out.print("Add more? Y/N: ");
            if (!scanner.next().equals("Y")) break;
        }

        System.out.println(solutionObj.solution(monitoring));
    }


}
