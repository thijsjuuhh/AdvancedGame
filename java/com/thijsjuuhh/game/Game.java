package com.thijsjuuhh.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.thijsjuuhh.game.display.Window;
import com.thijsjuuhh.game.texture.Texture;

public class Game implements Runnable {

	public static boolean running = false;
	public static Thread thread;

	public int width = Reference.GameNames.width, height = Reference.GameNames.height;

	public static void main(String[] args) {
		new Game();
	}

	public Game() {
		thread = new Thread(this, Reference.GameNames.gameName);
		new Window(Reference.GameNames.title, Reference.GameNames.width, Reference.GameNames.height);
		start();
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
		long lastTime = System.nanoTime();
		double delta = 0;
		double ns = 1000000000.0 / 60.0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		int updates = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1) {
				update();
				updates++;
				delta--;
			}
			render();
			frames++;
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println(updates + "ups, " + frames + " fps");
				updates = 0;
				frames = 0;
			}

		}
	}

	private void update() {
	}

	private void render() {
		BufferStrategy bs = Window.getFrame().getBufferStrategy();
		if (bs == null) {
			Window.getFrame().createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);

		g.drawImage(Texture.getTexture("/textures/basic.png"), 0, 0, null);

		g.dispose();
		bs.show();
	}
}
