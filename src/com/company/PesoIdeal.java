package com.company;

import javax.swing.JOptionPane;

public class PesoIdeal {

    public static void main(String[] arg){

        String genero = "";
        int pesoIdeal = 0;

        do {
            genero = JOptionPane.showInputDialog("Ingresa el genero (H/M): ");

        } while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        int altura= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su alturan en centimetro: "));
        if(genero.equalsIgnoreCase("H")) {
            pesoIdeal = altura-110;
        }
        if(genero.equalsIgnoreCase("M")) {
            pesoIdeal = altura-120;
        }

        System.out.print("Tu peso ideal es " + pesoIdeal + "kg");
    }
}
