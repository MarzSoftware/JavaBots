package javabots.model;

public class ArenaGrid {
	private int rows, cols;
	private ArenaGridCell[][] cells;
	
	public ArenaGrid(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
		cells = new ArenaGridCell[rows][cols];
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}
	
	public ArenaGridCell getCellAt(int row, int col) {
		if (row < 0 || row > cells.length || col < 0 || col > cells[0].length) {
			return null;
		}
		return cells[row][col];
	}
	
	public ArenaGridCell[] getCellsInRow(int row) {		
		return cells[row];
	}
	
	public ArenaGridCell[] getCellsInCol(int col) {
		ArenaGridCell[] cellsInRow = new ArenaGridCell[rows];
		for (int row = 0; row < cells.length; row++) {
			cellsInRow[row] = cells[row][col];
		}
		return cellsInRow;
	}
}
