package com.thijsjuuhh.game.entitys;

import java.awt.Graphics;

import com.thijsjuuhh.game.entity.GameObject;
import com.thijsjuuhh.game.entity.ID;
import com.thijsjuuhh.game.texture.Texture;

public class Player extends GameObject {

	public Player(int x, int y, ID id) {
		super(x, y, id);

	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Texture.getTexture("/textures/player.png", 20, 20), x, y, null);
	}

}
