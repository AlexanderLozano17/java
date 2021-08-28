package graficos;

import javax.swing.*;
import java.awt.*;

public class PruebaImagenes {

    public static void main(String[] args) {

        MarcoImagen marcoImagen = new MarcoImagen();
        marcoImagen.setVisible(true);
        marcoImagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


class MarcoImagen extends JFrame {

    public MarcoImagen() {
        setTitle("Marco con Imagen");
        setBounds(750, 300, 300 , 200);

        LaminaImagen laminaImagen = new LaminaImagen();
        add(laminaImagen);

    }

}

class LaminaImagen extends JPanel {


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}