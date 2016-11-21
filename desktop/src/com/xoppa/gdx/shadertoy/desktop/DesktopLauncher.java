package com.xoppa.gdx.shadertoy.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.xoppa.gdx.shadertoy.GdxShaderToy;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 768;
		config.height = 768;
		new LwjglApplication(new GdxShaderToy(), config);
	}
}
