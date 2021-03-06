package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {
        MarcoConTexto marco = new MarcoConTexto();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConTexto extends JFrame {

    public MarcoConTexto() {
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Primer Texto");

        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

class Lamina extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);// Realiza el trabajo de paintComponent y ademas adiciona los elementos que se programan
        g.drawString("Estamos aprendiendo Swing", 100, 100);
    }
}
