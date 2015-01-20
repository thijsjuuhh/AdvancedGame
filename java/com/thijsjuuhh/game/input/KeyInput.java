package com.thijsjuuhh.game.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.thijsjuuhh.game.entity.Handler;

public class KeyInput extends KeyAdapter {

	Handler handler = Handler.getInstance();

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key) {
		case KeyEvent.VK_W:
			Keys.w = true;
			break;
		case KeyEvent.VK_A:
			Keys.a = true;
			break;
		case KeyEvent.VK_S:
			Keys.s = true;
			break;
		case KeyEvent.VK_D:
			Keys.d = true;
			break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key) {
		case KeyEvent.VK_W:
			Keys.w = false;
			break;
		case KeyEvent.VK_A:
			Keys.a = false;
			break;
		case KeyEvent.VK_S:
			Keys.s = false;
			break;
		case KeyEvent.VK_D:
			Keys.d = false;
			break;
		}
	}
}
