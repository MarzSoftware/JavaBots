import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Driver {
	public static void main(String[] args) throws SlickException {
		AppGameContainer container = null;
		container = new AppGameContainer(new GameController());
		container.setDisplayMode(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT, false);
		container.setShowFPS(Constants.SHOW_FPS);
		container.setVSync(Constants.VSYNC_ENABLED);
		container.setSmoothDeltas(Constants.SMOOTH_DELTAS);
		container.start();	
	}
}
