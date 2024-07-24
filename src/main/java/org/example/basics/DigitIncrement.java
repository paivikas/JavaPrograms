package org.example.basics;

import java.util.Scanner;

public class DigitIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int digit , pos = 0, incNum = 0;
        while (num != 0) {
            digit = num % 10;
            incNum += (digit + 1 % 10) * (int) Math.pow(10, pos);
            pos++;
            num /= 10;
        }
        System.out.println("The incremented number is: " + incNum);
    }
}
