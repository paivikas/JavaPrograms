package org.example.basics;

import java.util.Scanner;

public class PrivilegedCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bill;
        char memCard;
        System.out.println("Enter the bill amount:");
        bill = sc.nextInt();
        System.out.println("Do you have a membership card?");
        memCard = sc.next().charAt(0);
        if (memCard == 'Y')
            System.out.println("Thank you! Your total bill amount is Rs " + bill + ", discount is Rs " + bill * 0.1 + " and net amount payable is Rs " + (bill - bill * 0.1) + ".");
        else
            System.out.println("Thank you! Your total bill amount is Rs " + bill + ", discount is Rs " + bill * 0.03 + " and net amount payable is Rs " + (bill - bill * 0.03) + ".");
        sc.close();
    }
}
