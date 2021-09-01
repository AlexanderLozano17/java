package com.layout;

import javax.swing.JFrame;

public class MainLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcosJFrame framePrincipal = new MarcosJFrame();
		framePrincipal.crearPrincipalJFrame("JFRAME PRINCIPAL");
		framePrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		framePrincipal.setVisible(true);
		
		MarcosJFrame frameSecundario = new MarcosJFrame();
		frameSecundario.setCloseWindows(false);
		frameSecundario.crearPrincipalJFrame("JFRAME SECUNDARIO");
		frameSecundario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameSecundario.setVisible(true);

	}

}
