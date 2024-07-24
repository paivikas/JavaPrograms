package org.example.basics;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num,fact=1;
        num=sc.nextInt();
        while(num!=0){
            fact*=(num--);
        }
        System.out.println("The factorial of the number is "+fact);
    }
}
