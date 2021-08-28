package com.company;

public class UsoArrays {

    public static void main(String[] args){
        // Declaración de matrices
        byte[] mi_matriz = new byte[5];
        byte mi_matriz2[] = {4, 6, -34, 56, 34};

        mi_matriz[0] = 5;
        mi_matriz[1] = 38;
        mi_matriz[2] = -15;
        mi_matriz[3] = 92;
        mi_matriz[4] = 71;

        for (byte i = 0; i<mi_matriz2.length; i++) {
            System.out.println("Valor del indice " + i + "= " + mi_matriz2[i]);
        }

        System.out.println("------------------------------");

        for (byte i = 0; i<mi_matriz.length; i++) {
            System.out.println("Valor del indice " + i + "= " + mi_matriz[i]);
        }

        System.out.println("------------------------------");

        String paises[] = {"España", "Mexico", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};
        
        for (String element:paises) {
            System.out.println("País " + element);
        }

    }
}
