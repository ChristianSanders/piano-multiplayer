package com.illeon.christiansanders.pianomultiplayer.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.illeon.christiansanders.pianomultiplayer.PianoMultiplayer;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new PianoMultiplayer(), config);
	}
}
