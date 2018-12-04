package com.harthoric.caesim;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.harthoric.caesim.animation.Animate;
import com.harthoric.caesim.screen.GameScreen;

public class Core extends Game {
	
	private GameScreen screen;
	
	@Override
	public void create () {
		screen = new GameScreen(this);
		this.setScreen(screen);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
}
