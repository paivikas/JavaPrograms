package org.example.basics;


public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            arr[i] = (arr[i] + 4) % 5;
            if (arr[i] == 0)
                arr[i] = 5;
            System.out.print(((arr[i])) + " ");

        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr[j] = (--arr[j]) % 5;
                if (arr[j] == 0)
                    arr[j] = 5;
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
