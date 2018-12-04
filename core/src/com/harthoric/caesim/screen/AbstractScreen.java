package com.harthoric.caesim.screen;

import com.badlogic.gdx.Screen;
import com.harthoric.caesim.Core;

public abstract class AbstractScreen implements Screen {
	
	private Core core;
	
	public AbstractScreen(Core core) {
		this.core = core;
	}

	@Override
	public abstract void show();

	@Override
	public abstract void render(float delta);

	@Override
	public abstract void resize(int width, int height);

	@Override
	public abstract void pause();

	@Override
	public abstract void resume();

	@Override
	public abstract void hide();

	@Override
	public abstract void dispose();
	
	public Core getCore() {
		return core;
	}

}
