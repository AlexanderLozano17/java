package com.company;

public class EjemploArray2D {
    // https://www.youtube.com/watch?v=xEHkuRApCno&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=26
    public static void main(String[] args){
        double acumulado;
        double interes=0.10;

        double saldo[][] = new double[6][5];

        for (byte i = 0; i<6; i++) {
            saldo[i][0] = 10000;
            acumulado = 10000;
            for (byte j=1; j<5; j++) {
                acumulado = acumulado + (acumulado * interes);
                saldo[i][j] = acumulado;
            }
            interes = interes + 0.01;
        }

        for (double element[]: saldo) {
            System.out.print("[");
            for(double z: element) {

                System.out.printf("%1.2f",z);
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
