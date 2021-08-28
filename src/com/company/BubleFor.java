package com.company;

import javax.swing.JOptionPane;

public class BubleFor {
    public static void main(String[] arg) {
        for (int i=10; i<10; i++){
            System.out.println("Alexander");
        }

        boolean arroba = false;
        do {
            String mail = JOptionPane.showInputDialog("Ingrese el email: ");
            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba = true;
                }
            }

            if (arroba == true) {
                System.out.println("Si tiene un @");
            } else {
                System.out.println("No tiene un @");
            }
        } while (arroba == false);
    }
}
