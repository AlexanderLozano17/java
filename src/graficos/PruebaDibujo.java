package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujo {

    public static void main(String[] args) {

        MarcosConDibujos marcoDibujo = new MarcosConDibujos();
        marcoDibujo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


class MarcosConDibujos extends JFrame {

    public MarcosConDibujos() {

        setTitle("Prueba de Dibujo");
        setSize(400,400);

        LaminaConFiguas miLamina = new LaminaConFiguas();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaConFiguas extends JPanel {

    public void  paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawRect(50,50,200,200);//RECTANGULO
        //g.drawLine(100,100,300,200);//LINEA
        //g.drawArc(50,100,100,200,120,150);//ARCO
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);

        g2.draw(new Line2D.Double(100, 100, 300, 250));

        double centroEnX = rectangulo.getCenterX();
        double centroEnY = rectangulo.getCenterY();

        double radio = 150;
        Ellipse2D circulo =  new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX+radio, centroEnY+radio);
        g2.draw(circulo);

        Font miFuente = new Font("Arial", Font.BOLD, 26);
        g2.setFont(miFuente);
        g2.setColor(Color.BLUE);
        g2.drawString("Alexander", 50, 50);
        g2.setFont(new Font("Arial", Font.ITALIC, 24 ));
        g2.drawString("Curso Java", 100, 200);
    }
}