package org.example.basics;

import java.util.Scanner;

public class BillDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double amt,discAmt=0;
        System.out.println("Enter the billing amount:");
        amt=sc.nextInt();
        if(amt>6000)
        {
            discAmt=amt*0.1;
        }
        System.out.println("Your net billing amount:"+(amt-discAmt));
        sc.close();
    }
}
