package poo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

    public static void main(String[] args) {

        Reloj miReloj = new Reloj();
        miReloj.enMarcha(3000,true);
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
        System.exit(0);
    }
}

class Reloj {

    public void enMarcha(int intervalo, final boolean sonido) {

        /**
         * La clase interna esta dentro de una clase y puede llevar modificador de acceso
         * La clase interna local esta dentro de un metodo y no debe llevar ningún modificador de acceso
         * Las clases internas si pueden tener el modificador de acceso private
         * Las clases internas pueden acceder a los atributos de la clase principal aun siendo privados
         */
        class DameHora2 implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                System.out.println("Te pongo la hora cada 3 Seg. " + ahora);

                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener oyente = new DameHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }
}
