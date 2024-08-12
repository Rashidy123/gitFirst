package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[][]numbers={
                {1,2,3,4,5,6,},
                {8,9,10,11,12,13},
        };
        for(int odd=0;odd<2;odd++) {
            for (int even = 0; even < numbers[odd].length; even++) {
                if (numbers[odd][even] % 2 == 0) {
                    System.out.print(numbers[odd][even]+" ");
                }
            }

        }
        System.out.println();
    }
}
