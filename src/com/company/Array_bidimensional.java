package com.company;

public class Array_bidimensional {

    public static void main(String[] args) {

        byte matrix[][] = new byte[4][5];

        // Rellenar matriz
        matrix[0][0] = 3;
        matrix[0][1] = 65;
        matrix[0][2] = 8;
        matrix[0][3] = 23;
        matrix[0][4] = 10;

        matrix[1][0] = 13;
        matrix[1][1] = 3;
        matrix[1][2] = -5;
        matrix[1][3] = 1;
        matrix[1][4] = 34;

        matrix[2][0] = 19;
        matrix[2][1] = 2;
        matrix[2][2] = 19;
        matrix[2][3] = 17;
        matrix[2][4] = 7;

        matrix[3][0] = 92;
        matrix[3][1] = 13;
        matrix[3][2] = 13;
        matrix[3][3] = 32;
        matrix[3][4] = 41;

        for (byte i= 0; i<4; i++) {
            System.out.println();
            for (byte j=0; j<5; j++) {
                System.out.print("["+matrix[i][j] + "] ");
            }
        }

        System.out.println();

        byte matrix1[][] = {
                {10, 14, 15 ,4, 6},
                {5, -6, 23, 6, 0},
                {0, 5, 12, -55, 9},
                {-7, 34, 2, 12, 3}
        };

        for (byte[]row: matrix1) {
            System.out.println();
            for (byte z: row) {
                System.out.print("["+z+"] ");
            }
        }
    }
}
