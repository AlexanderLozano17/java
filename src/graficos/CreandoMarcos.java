package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {

    public static void main(String[] args) {
        miMarco marco1 = new miMarco();
        marco1.setVisible(true); // Mustra la ventana
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Cierra la ventana
    }
}

class miMarco extends JFrame {
    
    public miMarco() {
        setSize(500, 300); // Da un tamaño a la ventana
        //setLocation(700,300); // ubica la ventna en un lugr de la pantalla
        setBounds(700,300,500,500);
        //setResizable(false);// permite redimensionar el marco
        setExtendedState(Frame.MAXIMIZED_BOTH);// Expande el marco en toda la pantalla
        setTitle("Mi Ventana");
    }
}
