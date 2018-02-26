package solutionchecker;

public class Black extends AbstractPiece{
	
	
	public void setnumber() {
		playernumber = 2 ;
	}
	
	@Override
	public boolean isValidPosition(int matrix[][], Position pnew) { //i indicates the player (1 or 2)
		boolean result = false;
		if (pnew.isOnBoard()) { 
				if (pnew.x() < current.x()) {
					if (((pnew.x()- current.x()) == (pnew.y()-current.y())) || ((pnew.x()-current.x()) == (current.y()-pnew.y()))) {
						if (matrix[pnew.x()][pnew.y()] == 0) {
							result = true ;
						}
					}
				}
			}
			return result ;
		}


}
