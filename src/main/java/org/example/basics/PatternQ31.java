package org.example.basics;

public class PatternQ31 {
    public static void main(String[] args) {
        int num = 19, iterator = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((num * (iterator++)) + " ");
            }
            System.out.println();
        }
    }
}
