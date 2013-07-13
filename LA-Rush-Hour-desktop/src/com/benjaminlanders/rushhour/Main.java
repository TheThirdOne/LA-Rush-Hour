package com.benjaminlanders.rushhour;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "LA-Rush-Hour";
		cfg.useGL20 = false;
		cfg.width = 512;
		cfg.height = 256;
		
		new LwjglApplication(new RushHour(), cfg);
	}
}
