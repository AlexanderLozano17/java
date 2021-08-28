package com.company;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ano = 2020; // declaración variable
        ano++; // Incremento 2021
        short medida = 15000;
        medida-=100; // decremento
        final byte edad = 35; // declaración constante

        double raiz = Math.sqrt(4); // libreria Math buscar raices

        int refundicion = (int)Math.round(raiz);//redondea y parsea el tipo de dato.

        double base = 5;
        double exponente = 3;
        int resultado = (int)Math.pow(base, exponente); // Exponenciales

        String nombre = "Alexander";
        int tamanoStrin = nombre.length(); // Tamaño de un string
        int getCaracter = nombre.charAt(0);


       //---------------------- CLASE SCANNER
        Scanner entreada = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor: ");
        String nombreUsuario = entreada.nextLine();
        System.out.println("Introduce tu edad, por favor: ");
        int edadd = entreada.nextInt();
        //System.out.println("Hola "+ nombreUsuario +", el año que viene tendrás " + (edadd + 1) + " años.");

        //------------------ DAR FORMATO A UN DATO DE SALIDA
        String num1  = JOptionPane.showInputDialog("Introduce un número: ");
        double num2 = Double.parseDouble(num1);
        System.out.print("La raíz de " + num2 + " es ");
        System.out.printf("%1.2f", Math.sqrt(num2));
        System.out.println();

        // ---------------------CLASE JOptionPane
        String nombres = JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
        String edads = JOptionPane.showInputDialog("Introduce tu edad, por favor: ");

        System.out.println("Hola "+ nombres +", el año que viene tendrás " + (Integer.parseInt(edads)+1) + " años.");


    }
}
