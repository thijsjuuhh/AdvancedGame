package com.thijsjuuhh.game.entitys;

import java.awt.Graphics;

import com.thijsjuuhh.game.entity.GameObject;
import com.thijsjuuhh.game.entity.ID;
import com.thijsjuuhh.game.input.Keys;
import com.thijsjuuhh.game.texture.Texture;

public class Player extends GameObject {

	private int speed = 5;
	
	public Player(int x, int y, ID id) {
		super(x, y, id);

	}

	@Override
	public void tick() {
		if(Keys.w) {
			velY -= speed;
		} else {
			velY = 0;
		}
		if(Keys.a) {
			velX -= speed;
		} else {
			velX = 0;
		}
		if(Keys.s) {
			velY += speed;
		} else {
			velY = 0;
		}
		if(Keys.d) {
			velX += speed;
		} else {
			velX = 0;
		}
		x+=velX;
		y+=velY;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Texture.getTexture("/textures/player.png", 20, 20), x, y, null);
	}

}
