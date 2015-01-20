package com.thijsjuuhh.game.texture;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Texture {

	public static Image getTexture(String url, int width, int height) {
		Image i = null;
		Image img = null;
		try {
			i = ImageIO.read(Texture.class.getResource(url));

			img = i.getScaledInstance(width, height, Image.SCALE_SMOOTH);

		} catch (IOException e) {
			System.out.println("File " + url + " not found!");
		}
		return img;
	}

	public static Image getTexture(String url) {
		BufferedImage i = null;
		try {
			i = ImageIO.read(Texture.class.getResource(url));
			System.out.println("Texture found");
		} catch (IOException e) {
			System.out.println("File " + url + " not found!");
		}
		return i;
	}

}
