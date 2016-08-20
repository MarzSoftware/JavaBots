package javabots.view;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import javabots.entities.Entity;
import javabots.model.ArenaGrid;

public class ArenaGridView extends Entity {
	
	private static final int CELL_WIDTH = 25; 
	private static final int CELL_HEIGHT = 25;
	
	private ArenaGrid gridModel;
	private ArenaGridViewCell[][] cells;
	
	public ArenaGridView(ArenaGrid gridModel) {
		super();
		this.gridModel = gridModel;
		cells = new ArenaGridViewCell[gridModel.getRows()][gridModel.getCols()];
		setupCells();
	}
	
	private void setupCells() {
		for(int row = 0; row < gridModel.getRows(); row++) {
			for(int col = 0; col < gridModel.getCols(); col++) {
				ArenaGridViewCell cell = new ArenaGridViewCell(col * CELL_WIDTH, row * CELL_HEIGHT, CELL_WIDTH, CELL_HEIGHT, Color.red);
				cells[row][col] = cell;
			}
		}
	}

	@Override
	public void update(GameContainer gc, int delta) {}

	@Override
	public void render(GameContainer gc, Graphics g) {
		for(int row = 0; row < gridModel.getRows(); row++) {
			for(int col = 0; col < gridModel.getCols(); col++) {
				cells[row][col].render(gc, g);
			}
		}
	}
}
