package javabots.model;

public class ArenaGridCell {
	private CellState state;
	
	ArenaGridCell() {
		super();
		state = CellState.EMPTY;
	}
	
	public CellState getState() {
		return state;
	}
	
	public void setState(CellState state) {
		this.state = state;
	}
}
