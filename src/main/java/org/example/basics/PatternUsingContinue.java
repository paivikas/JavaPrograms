package org.example.basics;

import java.util.Scanner;

public class PatternUsingContinue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if(i==j)
                    continue;
                else System.out.println(i+" "+j);
            }
        }
    }
}
