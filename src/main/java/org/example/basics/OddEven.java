package org.example.basics;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num =sc.nextInt();
        if(num %2!=0)
        {
            System.out.println("The entered number "+ num +" is odd");
        }
        else
            System.out.println("The entered number "+ num +" is even");
        sc.close();
    }
}
