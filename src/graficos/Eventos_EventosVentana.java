package graficos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Eventos_EventosVentana {

    public static void main(String[] args) {

        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setTitle("Ventana 1");
        miMarco.setBounds(300,300, 500,350);

        Marco miMarco2 = new Marco();
        miMarco2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        miMarco2.setTitle("Ventana 2");
        miMarco2.setBounds(900,300, 500,350);

    }
}

class Marco extends JFrame {

    public Marco() {
        setTitle("Eventos");
        setBounds(700,300,500,300);
        setVisible(true);

        EventosVentana eventosVentana = new EventosVentana();
        addWindowListener(eventosVentana);

    }
}

class EventosVentana implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana Abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Ventana Cerrando");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana Cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana Minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana Restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana Activa");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana Inactiva");
    }
}
