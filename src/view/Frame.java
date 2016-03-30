package view;

import java.awt.Container;

import javax.swing.*;
import model.CancerController;

public class Frame extends JFrame
{
	private CancerController baseController;
	private CancerPanel basePanel;
	
	public Frame(CancerController baseController)
	{
		this.baseController = baseController;
		basePanel = new CancerPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("Cancer of the wind");
		this.setResizable(false);
		this.setSize(400,400);
		this.setVisible(true);
	}
}
