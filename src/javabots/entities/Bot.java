package javabots.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import javabots.Constants;

public class Bot extends Entity {

	private BotAI botAI;
	private int energy;
	
	Bot(String name, BotAI botAI) {
		super();
		this.setImage("square");
		this.name = name;
		this.botAI = botAI;
		energy = Constants.STARTING_ENERGY;
	}
	
	public void tick(int time, char[][] view) {
		String responce = botAI.react(time, energy, view);
	}
	
	@Override
	public void update(GameContainer gc, int delta) {
		
	}

	@Override
	public void render(GameContainer gc, Graphics g) {
		g.drawImage(image, x, y, color);
	}

}
