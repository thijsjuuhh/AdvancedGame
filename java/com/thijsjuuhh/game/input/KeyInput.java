package com.thijsjuuhh.game.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.thijsjuuhh.game.entity.GameObject;
import com.thijsjuuhh.game.entity.Handler;
import com.thijsjuuhh.game.entity.ID;

public class KeyInput extends KeyAdapter {

	Handler handler = Handler.getInstance();

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_W:
			for (int i = 0; i < handler.object.size(); i++) {
				GameObject to = handler.object.get(i);
				if (to.getId() == ID.Player)
					to.velY -= 5;
			}
			break;
		case KeyEvent.VK_S:
			for (int i = 0; i < handler.object.size(); i++) {
				GameObject to = handler.object.get(i);
				if (to.getId() == ID.Player)
					to.velX += 5;
			}
			break;
		case KeyEvent.VK_A:
			for (int i = 0; i < handler.object.size(); i++) {
				GameObject to = handler.object.get(i);
				if (to.getId() == ID.Player)
					to.velY += 5;

			}
			break;
		case KeyEvent.VK_D:
			for (int i = 0; i < handler.object.size(); i++) {
				GameObject to = handler.object.get(i);
				if (to.getId() == ID.Player)
					to.velX -= 5;
			}
			break;

		}
	}
}
