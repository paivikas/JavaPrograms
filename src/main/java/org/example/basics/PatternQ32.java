package org.example.basics;

public class PatternQ32 {
    public static void main(String[] args) {
        char alpha ='A';
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((alpha++)+" ");
            }
            System.out.println();
        }
    }
}
