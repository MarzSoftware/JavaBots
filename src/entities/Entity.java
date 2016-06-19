package entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 * Entity.java - Base class for renderable sprite objects.
 * 
 * @author Ben
 * @version 25-NOV-2015
 */
public abstract class Entity {
	protected String name;
	protected float x, y;
	protected float dirX, dirY;
	protected float rotz;
	protected float width, height, scale;
	protected Image image;
	protected Color color;

	protected boolean shouldRemove;

	public Entity() {
		scale = 1.0f;
		shouldRemove = false;
		name = "";
	}

	public abstract void update(GameContainer gc, int delta);
	public abstract void renderExtra(GameContainer gc, Graphics g);

	public void move(float dx, float dy) {
		x = x + dx;
		y = y + dy;
	}

	public void updateDirection(float dirX, float dirY) {
		this.dirX = dirX;
		this.dirY = dirY;
	}

	public void rotate(float z) {
		rotz = rotz + z;
	}

	public boolean intersects(Entity e) {
		Shape r1 = new Rectangle(e.getX(), e.getY(), e.getWidth(), e.getHeight());
		Shape r2 = new Rectangle(getX(), getY(), getWidth(), getHeight());
		return r1.intersects(r2) || r1.contains(r2);
	}

	public void setImage(String filename) {
		try {
			image = new Image("res/" + filename);
			width = image.getWidth();
			height = image.getHeight();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public boolean shouldRemove() {
		return shouldRemove;
	}

	public String getName() {
		return name;
	}
	
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getDirX() {
		return dirX;
	}

	public float getDirY() {
		return dirY;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public float getScale() {
		return scale;
	}

	public Image getImage() {
		return image;
	}

	public float getRotz() {
		return rotz;
	}

	public void setShouldRemove(boolean remove) {
		shouldRemove = remove;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setRotz(float rotz) {
		this.rotz = rotz;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}	
}
