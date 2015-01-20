package com.thijsjuuhh.game.entity;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	public static Handler instance;

	public LinkedList<GameObject> object = new LinkedList<GameObject>();

	public Handler() {
		instance = this;
	}

	public void tick() {
		for (int i = 0; i < object.size(); i++) {
			GameObject to = object.get(i);

			to.tick();
		}
	}

	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			GameObject to = object.get(i);
			to.render(g);
		}
	}

	public void addObject(GameObject object) {
		this.object.add(object);
	}

	public void remObject(GameObject object) {
		this.object.remove(object);
	}

	public static Handler getInstance() {
		return instance;
	}
}
