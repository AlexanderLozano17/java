package com.company;

import javax.swing.JOptionPane;

public class AccesoAplicacion {

    public static void main(String[] args) {

        String clave = "Alexander";
        String pass = "";

        while (clave.equals(pass)==false) {

            pass = JOptionPane.showInputDialog("Introduce la contraseña");

            if (clave.equals(pass)==false) {
                System.out.println("Clave incorrecta.");
            }
        }
        System.out.print("Clave correcta acceso permitido.");
    }
}
