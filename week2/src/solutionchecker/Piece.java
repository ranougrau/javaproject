package solutionchecker;

public interface Piece {
	
	public void setArbitraryPosition(Position currentPosition);  

	public boolean isValidPosition(int matrix[][], Position newPosition); 

	public void move(int[][] matrix, AbstractPiece p);
	
	public void setnumber() ;
	
}
