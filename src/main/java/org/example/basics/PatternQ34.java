package org.example.basics;

public class PatternQ34 {
    public static void main(String[] args) {
        int num =19;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==i)
                    System.out.print(num +" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
