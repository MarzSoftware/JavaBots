package entities;

public interface BotAI {

	void welcome(int gameTime);
	
	String react(int time, int energy, char[][] view);
	
	void goodBye();
}
