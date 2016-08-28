package com.jclab.webcamdetector.gui;

import javax.swing.JFrame;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.VideoCapture;

import com.jclab.webcamdetector.logic.Detector;

public class MainFrame extends JFrame {
		
	private static final long serialVersionUID = 1L;
	private Detector detector;
	private CameraPanel cameraPanel;
	
	public MainFrame() {
		super("Face Detection");
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		detector = new Detector();
		cameraPanel = new CameraPanel();
		
		setContentPane(cameraPanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 500);
		setVisible(true);		
	}

	public void displayScreen() {				
		Mat mat = new Mat();
		VideoCapture videoCapture = new VideoCapture(0);
		
		if(videoCapture.isOpened()) {
			
			while(true) {
				
				videoCapture.read(mat);
				
				if(!mat.empty()) {
					setSize(mat.width() + 50, mat.height() + 70);
					mat = detector.detect(mat);
					cameraPanel.convertMatToImage(mat);					
					cameraPanel.repaint();
				} else {
					System.out.println("Problem");
					break;
				}
				
			}
			
		}
	}
	
}