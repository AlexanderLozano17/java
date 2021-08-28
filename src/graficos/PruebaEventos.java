package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos {

    public static void main(String[] args) {

        MarcoBotones marcoBotones =  new MarcoBotones();
        marcoBotones.setVisible(true);
        marcoBotones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoBotones extends JFrame {

    public MarcoBotones() {

        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);

        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);


    }

}
 class LaminaBotones extends JPanel implements ActionListener {
    JButton botonAzul = new JButton("Azul");
     JButton botonAmarillo = new JButton("Amarillo");
     JButton botonRojo= new JButton("Rojo");

    public LaminaBotones() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
    }

     @Override
     public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();

        if (botonPulsado == botonAzul) {
            setBackground(Color.blue);
        }
         if (botonPulsado == botonAmarillo) {
             setBackground(Color.yellow);
         } else {
             setBackground(Color.red);
         }
     }
 }