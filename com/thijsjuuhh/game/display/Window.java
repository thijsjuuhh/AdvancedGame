package com.thijsjuuhh.game.display;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	public static ArrayList<int i> frames = new ArrayList<int i>();

	public Window(String title) {
		setTitle(title);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

}
