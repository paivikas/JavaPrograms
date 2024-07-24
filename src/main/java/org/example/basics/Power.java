package org.example.basics;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=sc.nextInt();
        System.out.println("Enter num2:");
        int num2=sc.nextInt();
        int ans=1;
        for (int i = 1; i <= num2; i++) {
            ans*=num1;
        }
        System.out.println("num1^num2 is: "+ans);
    }
}
