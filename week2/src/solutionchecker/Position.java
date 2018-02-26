package solutionchecker;

public class Position {
	private int x, y;
	public Position(int x, int y) {
		this.x = x ;
		this.y = y ;
	}
	public boolean isOnBoard() {
		return (x >= 0 && x <= 7 && y >= 0 && y <= 7);
	}
	public int x() {
		return x;
	}
	public int y() {
		return y;
	}
}
