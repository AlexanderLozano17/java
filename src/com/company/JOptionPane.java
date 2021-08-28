package com.company;

import java.util.Scanner;

public class JOptionPane {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4 Circulo");
        int option = scanner.nextInt();

        switch (option) {
            case 1:

                int lado = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingresa un lado cuadrado"));
                System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));

                break;

            case 2:

                int baseRec = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingresa la base Rectangulo"));
                int alturaRec = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingresa la Altura Rectangulo"));
                System.out.println("El area del Rectangulo es: " + baseRec * alturaRec);

                break;

            case 3:
                int baseTri = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingresa la base del triangulo"));
                int alturaTri = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingresa la Altura triangulo"));
                System.out.println("El area del Triangulo es: " + (baseTri * alturaTri)/2);

                break;

            case 4:

                int radio = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingresa el radio del circulo"));
                System.out.print("El area del Circulo es: ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));

                break;

            default:
                System.out.print("La opción no es valida.");
        }
    }
}
