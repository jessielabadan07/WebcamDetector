package com.jclab.webcamdetector.app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jclab.webcamdetector.gui.MainFrame;

public class App {

	public static void main(String[] args) {
		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		MainFrame mainFrame = new MainFrame();
		mainFrame.displayScreen();
	}

}
