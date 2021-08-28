package com.company;

import java.util.Scanner;

public class Tipos_Enumerados {

    /**
     * Las variables de tipo enum restringen la asignación de datos asi misma
     * No permiten crear instancia a otras claes
     * Se debe declara de form global
     * Permite crear contructor
     */

    enum Talla {

        MINI("S"), MEDIANA("M"), GRANDE("X"), MUY_GRANDE("XL");
        private String abreviatura;

        private Talla(String abreviatura) {
            this.abreviatura = abreviatura;
        }

        public String dameAbreviatura() {
            return this.abreviatura;
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANA, GRANDE, MUY_GRANDE");
        String entradaDatos = entrada.next().toUpperCase();
        Talla la_talla = Enum.valueOf(Talla.class, entradaDatos);//Detectar a que tipo pertenece el texto

        System.out.println("Talla = " + la_talla);
        System.out.println("Abreviatura = " + la_talla.dameAbreviatura());
    }
}
