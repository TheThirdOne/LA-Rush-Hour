package com.benjaminlanders.rushhour.client;

import com.benjaminlanders.rushhour.RushHour;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class GwtLauncher extends GwtApplication {
	@Override
	public GwtApplicationConfiguration getConfig () {
		GwtApplicationConfiguration cfg = new GwtApplicationConfiguration(512, 256);
		return cfg;
	}

	@Override
	public ApplicationListener getApplicationListener () {
		return new RushHour();
	}
}