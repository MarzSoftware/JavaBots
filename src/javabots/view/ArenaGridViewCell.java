package javabots.view;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

import javabots.entities.Entity;

public class ArenaGridViewCell extends Entity {

	ArenaGridViewCell(int x, int y, int width, int height, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	@Override
	public void update(GameContainer gc, int delta) {}

	@Override
	public void render(GameContainer gc, Graphics g) {
		g.setColor(color);
		g.draw(new Rectangle(x, y, width, height));
	}
	
}
