package com.thijsjuuhh.game.display;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	private static JFrame frame;

	public Window(String title, int width, int height) {
		frame = this;
		frame.setTitle(title);
		frame.setSize(new Dimension(width, height));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static JFrame getFrame() {
		return frame;
	}

}
