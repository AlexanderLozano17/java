package com.layout;

import java.awt.Frame;

import javax.swing.JFrame;

public class MarcosJFrame extends JFrame {
	
	private JFrame frame;
	private boolean closeWindows;
	
	public MarcosJFrame() {
		this.closeWindows = true;
	}
	
	
	public void crearPrincipalJFrame(String titleFrame) {
		
		JFrame frame = new JFrame();
		setTitle(titleFrame);
		
		
	}
	
	public void setCloseWindows(boolean closeWindows) {
		this.closeWindows = closeWindows;
	}
	
	public boolean getCloseWindows() {
		return this.closeWindows;
	}
	

}
