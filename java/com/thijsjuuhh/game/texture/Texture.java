package com.thijsjuuhh.game.texture;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Texture {
	public static BufferedImage getTexture(String url) {
		BufferedImage img = null;
		File file = new File(url);
		try {
			img = ImageIO.read(file);
			
		} catch (IOException e) {
			System.out.println("img not found");
			System.out.println(file.getAbsolutePath());
		}
		return img;
	}
	public static BufferedImage getTexture(String url, int width, int height) {
		BufferedImage img = null;
		File file = new File(url);
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			System.out.println("img not found");
			System.out.println(file.getAbsolutePath());
		}
		return img;
	}
}
