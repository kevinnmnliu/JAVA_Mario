package devforrest.mario.core;

import java.util.ArrayList;

import devforrest.mario.core.sound.specific.MarioSoundManager22050Hz;
import devforrest.mario.core.tile.TileMap;
import devforrest.mario.objects.base.Creature;
import devforrest.mario.objects.creatures.*;


public class Creature_Factory {

	int count;
	boolean mult;
	TileMap map;
	
	public Creature_Factory(TileMap map, int count) {
		this.count = count;
		this.mult = false;
		this.map = map;
	}
	
	public boolean multiply() {
		if (mult) {
			mult = false;
			return true;
		}
		else {
			return false;
		}
	}
	public Creature createCreature(char ch, int pixelX, int pixelY, MarioSoundManager22050Hz soundManager){
		Creature c = null;
		if (ch == 'G') {
			c = createGoomba(pixelX, pixelY, soundManager);
			this.mult = true;
		}
		else if	(ch == 'K'){
			c = createKoopa(pixelX, pixelY, soundManager);
			this.mult = true;
		}
		else if (ch == 'C') {
			c = createCoin(pixelX, pixelY);
		}
		else if (ch == 'S') {
			c = createShell(pixelX, pixelY, soundManager);
			
		}
		return c;
	}
	

	private Goomba createGoomba(int pixelX, int pixelY,  MarioSoundManager22050Hz soundManager){
		return new Goomba(pixelX, pixelY, soundManager);
	}
	
	private RedKoopa createKoopa(int pixelX, int pixelY,  MarioSoundManager22050Hz soundManager){
		return new RedKoopa(pixelX, pixelY, soundManager);
	}
	
	private Coin createCoin(int pixelX, int pixelY){
		return new Coin(pixelX, pixelY);
	}
	
	private RedShell createShell(int pixelX, int pixelY,  MarioSoundManager22050Hz soundManager){
		return new RedShell(pixelX, pixelY, map, soundManager, true);
	}
}
