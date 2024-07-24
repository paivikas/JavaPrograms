package org.example.basics;

public class PatternQ27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num =1;
            for (int j = 0; j < i; j++) {
                System.out.print((num++)+" ");
            }
            System.out.println();
        }
    }
}
