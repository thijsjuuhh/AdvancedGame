package com.thijsjuuhh.game;

public class Game implements Runnable {

	public static boolean running = false;
	public static Thread thread;

	public static void main(String[] args) {
		System.out.println("System running");
	}

	public Game() {
		thread = new Thread(this, Reference.GameNames.gameName);

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
