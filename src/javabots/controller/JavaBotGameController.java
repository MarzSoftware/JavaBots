package javabots.controller;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import javabots.model.ArenaGrid;
import javabots.view.ArenaGridView;

public class JavaBotGameController extends BasicGameState {

	ArenaGrid gridModel;
	ArenaGridView gridView;
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		gridModel = new ArenaGrid(40, 30);
		gridView = new ArenaGridView(gridModel);
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		gridView.render(gc, g);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		gridView.update(gc, delta);
	}

	@Override
	public int getID() {
		return 0;
	}

}
