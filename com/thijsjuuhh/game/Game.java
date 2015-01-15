package com.thijsjuuhh.game;

import javax.swing.JFrame;

import com.thijsjuuhh.game.display.Window;

public class Game implements Runnable {

	public static boolean running = false;
	public static Thread thread;
	JFrame frame;

	public static void main(String[] args) {
		System.out.println("System running");
	}

	public Game() {
		thread = new Thread(this, Reference.GameNames.gameName);
		frame = new Window(Reference.GameNames.title);
	}

	public synchronized void start() {
		running = true;
		thread.start();
	}

	public synchronized void stop() {
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (running)
			System.out.println("System running");
	}

}
