package com.harthoric.caesim.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.harthoric.caesim.Core;
import com.harthoric.caesim.animation.Animate;

public class GameScreen extends AbstractScreen {

	Texture walkSheet;
	SpriteBatch spriteBatch;
	float stateTime;

	private Animate animate;

	public GameScreen(Core core) {
		super(core);

		walkSheet = new Texture(Gdx.files.internal("sprite/player/default.png"));
		animate = new Animate(walkSheet);
		spriteBatch = new SpriteBatch();
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		stateTime += Gdx.graphics.getDeltaTime();
		animate.setFrame(stateTime / 10, true);

		spriteBatch.begin();
		spriteBatch.draw(animate.getFrame(), 50, 50);
		spriteBatch.end();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {
		spriteBatch.dispose();
		walkSheet.dispose();
	}

}
