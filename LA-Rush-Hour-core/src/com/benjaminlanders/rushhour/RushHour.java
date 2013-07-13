package com.benjaminlanders.rushhour;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class RushHour implements ApplicationListener {
	private SpriteBatch batch;
	private TextureRegion car, night, day;
	
	float w, h, time;
	
	@Override
	public void create() {		
		w = Gdx.graphics.getWidth();
		h = Gdx.graphics.getHeight();
		batch = new SpriteBatch();
		
		Texture cartex = new Texture(Gdx.files.internal("data/car.png"));
		Texture attex = new Texture(Gdx.files.internal("data/nightday.png"));
		car = new TextureRegion(cartex, 0, 0, 512, 256);
		day = new TextureRegion(attex,0,0,512,512);
		night =  new TextureRegion(attex,0,512,512,512);
		
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		time+=Gdx.graphics.getDeltaTime();
		//batch.setProjectionMatrix(camera.combined);
		batch.begin();
		
		batch.draw(day,0,w - ((time*50 + w)% (int)(w*2)) , w, w);
		batch.draw(night,0,w - ((time*50) % (int)(w*2)) , w, w);

		batch.draw(car,0, 0, w, h);
		batch.end();
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
}
