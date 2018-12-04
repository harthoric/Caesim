package com.harthoric.caesim.animation;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Animate {
	
	private static final int FRAME_COLUMNS = 4, FRAME_ROWS = 4;
	
	private Texture texture;
	
	TextureRegion currentFrame;
	TextureRegion[] walkFrames;
	Animation<TextureRegion> walkAnimation;
	
	public Animate(Texture texture) {
		this.texture = texture;
		
		walkFrames = new TextureRegion[FRAME_COLUMNS * FRAME_ROWS];
		createFrames();
		currentFrame = walkAnimation.getKeyFrame(1);
	}
	
	public void createFrames() {
		TextureRegion[][] tmp = TextureRegion.split(texture, texture.getWidth() / FRAME_COLUMNS, texture.getHeight() / FRAME_ROWS);
		int index = 0;
		for(int i = 0; i < FRAME_ROWS; i++) {
			for(int j = 0; j < FRAME_COLUMNS; j++) {
				walkFrames[index++] = tmp[i][j];
			}
		}
		
		walkAnimation = new Animation<TextureRegion>(0.025f, walkFrames);
	}

	public void setFrame(float index, boolean loop) {
		currentFrame = walkAnimation.getKeyFrame(index, loop);
	}
	
	public TextureRegion getFrame() {
		return currentFrame;
	}
	
}
