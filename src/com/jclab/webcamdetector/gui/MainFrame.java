package com.jclab.webcamdetector.gui;

import javax.swing.JFrame;
import com.jclab.webcamdetector.logic.Detector;

public class MainFrame extends JFrame {
		
	private static final long serialVersionUID = 1L;
	private Detector processor;
	private CameraPanel cameraPanel;
	
	public MainFrame() {
		super("Face Detection");
		
	}
	
}