package solutionchecker;

import java.util.Scanner;

public class Board {
		
		public int[][] createBoard() {
			int[][] matrix = new int [8][8] ;
			int j,i;
		
			for(j=0;j<3;j++) {
				for (i=0; i<8 ;i++) {
					if (((j % 2) == 0) && ((i % 2) != 0 )) {
						matrix[j][i]=1 ;
					}
					if (((j % 2) != 0) && ((i % 2) == 0 )) {
						matrix[j][i]=1 ;
					}
				}
			}
		
			for(j=5;j<8;j++) {
				for (i=0; i<8 ;i++) {
					if (((j % 2) == 0) && ((i % 2) != 0 )) {
							matrix[j][i]=2 ;
					}
					if (((j % 2) != 0) && ((i % 2) == 0 )) {
							matrix[j][i]=2 ;
						}
				}
			}
			return matrix ;
		}
		
		

		public void Display(int[][] matrix) {
			int i,j ; // i indicates the current line and j indicates the current column
			String aux = "" ;// auxiliary used for concatenation of strings
			System.out.println("    0 1 2 3 4 5 6 7     <-- X axis");
			System.out.println("  +----------------+");
			for (i=0; i<8; i++) {
				System.out.print(i + " |");
				for (j=0; j<8; j++) {
					if (matrix[i][j] != 0) {
			        aux = aux + "  " + matrix[i][j] ;
					}
					if (matrix[i][j] == 0) {
					aux = aux + " " ;
					}
				}
				System.out.println(aux);
				aux = "";
			}
			System.out.println("  +----------------+");
			System.out.println("    0 1 2 3 4 5 6 7");
		}
		
		public static void main(String[] args) {
			Board board = new Board() ;
			AbstractPiece whitepiece = new White() ;
			AbstractPiece blackpiece = new Black() ;
			int[][] matrix = board.createBoard(); 
			int testmatrix[][] = {
			{0, 1, 0, 1, 0, 1, 0, 1},
			{1, 0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{2, 0, 2, 0, 2, 0, 2, 0},
			{0, 2, 0, 2, 0, 2, 0, 2},
			{2, 0, 2, 0, 2, 0, 2, 0}
			};
			board.Display(matrix);
			int aux[][] = matrix ; //auxiliary equals to our initial board but used for doing operations on it 
			Scanner s = new Scanner(System.in);
			System.out.println("Number of round(s) : ");
			int numberofrounds = s.nextInt();
			System.out.println(numberofrounds);
			int counter = 1;
			while(counter <= numberofrounds) {
			System.out.println("Round number " + (counter));
			whitepiece.move(aux,whitepiece);
			blackpiece.move(aux,blackpiece);
			board.Display(matrix);
			counter += 1;
			}
		}

}

