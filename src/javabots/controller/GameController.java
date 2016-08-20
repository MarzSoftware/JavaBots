package javabots.controller;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import javabots.Constants;

public class GameController extends StateBasedGame {

	private JavaBotGameController gameView;

	public GameController() {
		super(Constants.GAME_NAME);
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		gameView = new JavaBotGameController();
		addState(gameView);
	}
	
	@Override
	public boolean closeRequested() {	
		return true;
	}
}
