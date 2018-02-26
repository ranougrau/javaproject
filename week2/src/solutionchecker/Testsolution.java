package solutionchecker;

import java.util.Scanner;

import solutionchecker.Board; 

public class Testsolution {
	
	public static void main(String[] args) {
		Board board = new Board() ;
		AbstractPiece whitepiece = new White() ;
		AbstractPiece blackpiece = new Black() ;
		int[][] matrix = board.createBoard(); 
		board.Display(matrix);
		int aux[][] = matrix ; //auxiliary equals to our initial board but used for doing operations on it 
		Scanner s = new Scanner(System.in);
		System.out.println("Number of round(s) : ");
		int numberofrounds = s.nextInt();
		System.out.println(numberofrounds);
		int counter = 0;
		while(counter <= numberofrounds) {
		System.out.println("Round number " + (counter+1));
		whitepiece.move(aux,1);
		blackpiece.move(aux,2);
		board.Display(matrix);
		counter += 1;
		}
	}

}
