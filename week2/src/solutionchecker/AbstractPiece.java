package solutionchecker;

import java.util.Scanner;

public abstract class AbstractPiece implements Piece {
	protected Position current;
	int playernumber ;
	
	public void setArbitraryPosition(int x, int y) {
		setArbitraryPosition(new Position(x, y));
	}
	@Override
	public void setArbitraryPosition(Position currentPosition) {
		if (currentPosition.isOnBoard()) {
			this.current = currentPosition;
		}
	}
	@Override
	public void move(int[][] matrix, AbstractPiece piece) { // i indicates the player (1 or 2)}
		Scanner s = new Scanner(System.in);
		Scanner snew = new Scanner(System.in) ;
		Scanner tnew = new Scanner(System.in) ;
		piece.setnumber() ;
		System.out.println("Turn of player no" + piece.playernumber);
		System.out.println("Enter the position X : ");
		int x = s.nextInt();
		System.out.println(x);	
		Scanner t = new Scanner(System.in);
		System.out.println("Enter the position Y : ");
		int y = t.nextInt();
		System.out.println(y);
		setArbitraryPosition(x,y);
		while (matrix[current.x()][current.y()] != piece.playernumber) {
			System.out.println("There is no piece in this position, define a new position");
			System.out.println("Enter the position X : ");
			x = s.nextInt();
			System.out.println(x);	
			System.out.println("Enter the position Y : ");
			y = t.nextInt();
			System.out.println(y);
			setArbitraryPosition(x,y);
		}		
			System.out.println("Coordinate of new position");
			System.out.println("New position of X : ");
			int xnew = snew.nextInt();
			System.out.println(xnew);	
			System.out.println("New position of Y : ");
			int ynew = tnew.nextInt();
			System.out.println(ynew);
			Position newPosition = new Position(xnew,ynew);
			while (piece.isValidPosition(matrix, newPosition) == false) {
				System.out.println("Conditions not ok");
				System.out.println("New position of X : ");
				xnew = snew.nextInt();
				System.out.println(xnew);	
				System.out.println("New position of Y : ");
				ynew = tnew.nextInt();
				System.out.println(ynew);
				newPosition = new Position(xnew,ynew);
			}
				System.out.println("Piece moved"); //conditions verified
				newPosition = new Position(xnew,ynew);
				matrix[current.x()][current.y()] = 0;
				matrix[newPosition.x()][newPosition.y()] = piece.playernumber;
				
	}

}
