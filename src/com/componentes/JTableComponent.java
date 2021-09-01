package com.componentes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableComponent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Lamina lamina = new Lamina();
		lamina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lamina.setVisible(true);
	}

}

class Lamina extends JFrame {
	
	private JTable jtablePlanetas;
	private JButton botonInpirmir;;
	private String[]  nombresColumnas = {"Nombre", "Radio", "Lunas", "Gaseoso"};
	private Object [][] datosFila = {
			{"Mercurio", 244.0, 0, false},
			{"Venus", 6052.0, 0, false},
			{"Tierra", 6378.0, 0, false},
			{"Marte", 3397.0, 0, false},
			{"Jupiter", 71492.0, 0, true},
			{"Saturno", 60298.0, 0, true},
			{"Urano", 25559.0, 0, true},
			{"Neptuno", 24766.0, 0, true},
			{"Pluton", 1137.0, 0, false}
	};
	
	public Lamina() {
		setTitle("Los Planetas");
		setBounds(300, 300, 400, 200);
		
		jtablePlanetas = new JTable(datosFila, nombresColumnas);
		botonInpirmir = new JButton("Imprimir");
		
		add(new JScrollPane(jtablePlanetas), BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.add(botonInpirmir);
		add(panel, BorderLayout.SOUTH);
		
		botonInpirmir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					jtablePlanetas.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	}
}
