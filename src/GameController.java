
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class GameController extends StateBasedGame {

	private JavaBotGame game;

	public GameController() {
		super(Constants.GAME_NAME);
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		game = new JavaBotGame();
		addState(game);
	}
	
	@Override
	public boolean closeRequested() {	
		return true;
	}
}
