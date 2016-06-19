package entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Bot extends Entity {

	private BotAI botAI;
	private int energy;
	
	Bot(String name, BotAI botAI) {
		super();
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
	public void renderExtra(GameContainer gc, Graphics g) {
		
	}

}
