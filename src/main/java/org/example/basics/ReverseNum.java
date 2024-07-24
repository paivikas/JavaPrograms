package org.example.basics;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        int num,revNum=0,digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        num=sc.nextInt();
        while (num != 0) {
            digit = num % 10;
            num /= 10;
            revNum=(revNum*(10))+digit;
        }
        System.out.println("Reverse of the entered number is "+revNum);
    }
}
