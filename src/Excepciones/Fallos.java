package Excepciones;

import javax.swing.*;

public class Fallos {

    public static void main(String[] args) {

        int[] miMatriz = new int[5];

        miMatriz[0] = 5;
        miMatriz[1] = 43;
        miMatriz[2] = 2;
        miMatriz[3] = 45;
        miMatriz[4] = 9;
        miMatriz[5] = 5;

        for (int i=0;i<5;i++) {
            System.out.println("Posición " + i + " = " + miMatriz[i]);
        }

        String nombre = JOptionPane.showInputDialog("Indroduce el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introducir la edad"));

        System.out.println("Nombre: " + nombre + "Edad = " + edad);
    }
}
