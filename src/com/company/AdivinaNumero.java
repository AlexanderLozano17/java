package com.company;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        int random = (int)(Math.random()*100);

        int numero=0;
        int intentos=0;

        do {
            intentos++;
            System.out.println("Introduce un número porfavor");
            numero = scanner.nextInt();
            System.out.println("número aleatorio = "+random+" Número introducido ="+numero);
            if (random < numero) {
                System.out.println("El número es mas bajo");
            }
            if (random > numero) {
                System.out.println("El número es mas alto");
            }
        } while(numero!=random);

        System.out.println("Número correcto, Lo has conseguido en "+intentos+" intentos.");



    }
}
