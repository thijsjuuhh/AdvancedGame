package com.thijsjuuhh.game.texture;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Texture {
	public static BufferedImage getTexture(String url) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(Texture.class.getResource("/textures/noTexture.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			img = ImageIO.read(Texture.class.getResource(url));
		} catch (Exception e) {
			System.out.println("img not found");
			try {
				img = ImageIO.read(Texture.class.getResource("/textures/noTexture.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
		return img;
	}

	public static BufferedImage getTexture(String url, int width, int height) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(Texture.class.getResource(url));
		} catch (Exception e) {
			System.out.println("img not found");
			try {
				img = ImageIO.read(Texture.class.getResource("/textures/noTexture.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		return img;
	}
}
