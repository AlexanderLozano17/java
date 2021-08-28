package graficos;

import javax.swing.*;
import java.awt.*;

// Adacta la pantalla a cualquier tamaño de una pantallla
public class CreandoMarcoCentrado {

    public static void main(String[] args) {

        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCentrado extends JFrame {

    public MarcoCentrado() {

        Toolkit miPantalla = Toolkit.getDefaultToolkit();// Consigue almacenar el sistema nativo de ventanas
        Dimension tamanoPantalla = miPantalla.getScreenSize();//Retorna el tamaño del monitor principal return object dimention

        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);// Crea el tamaño de la panatalla
        setLocation(anchoPantalla/4, alturaPantalla/4);// ubicación del marco
        setTitle("Marco Centrado");
        Image miIcono = miPantalla.getImage("C:\\Users\\LEX\\Google Drive\\Mis proyectos\\repositorios\\genesis_dev\\extra\\img\\estados.png");//gif, pjg, png
        setIconImage(miIcono);

    }
}