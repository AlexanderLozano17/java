package graficos;

import javax.swing.*;
import java.awt.*;

public class ObtenerFuetesFont {

    public static void main(String[] args) {

        String fuente = JOptionPane.showInputDialog("Intorduce fuente");
        boolean estalaFuente = false;
        String mensaje = "No esta instalada la fuente";

        String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for(String listFunte : nombresDeFuentes) {
            if (listFunte.equals(fuente)) {
                estalaFuente = true;
            }
        }

        if (estalaFuente) {
            mensaje = "Fuente instalada";
        }
        System.out.println(mensaje);
    }
}
