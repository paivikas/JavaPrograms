package org.example.basics;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charcter:");
        char alpha=sc.next().charAt(0);
        switch (alpha){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is a consonant");
                break;
        }
    }
}
