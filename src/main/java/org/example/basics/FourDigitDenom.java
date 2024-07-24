package org.example.basics;

import java.util.Scanner;

public class FourDigitDenom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, pos = 1000;
        System.out.println("Enter a four digit number:");
        num = sc.nextInt();
        while (pos != 0) {
            System.out.println(num / pos + "*" + pos + " =" + ((num / pos) * pos));
            num -= ((num / pos) * pos);
            pos /= 10;
        }
    }
}
