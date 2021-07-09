public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		int c = cellId/8;
		return c;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int r = cellId%8;
		return r;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................
			
		*/
		for(int i=0;i<8;i++) {
			if(placedQueens[row][i]==true) {
				isValid = false;
			}
		}
		for(int i=0;i<8;i++) {
			if(placedQueens[i][col]==true) {
				isValid = false;
			}
		}
		int i = row;
		int j = col;
		while(i<8 && j<8) {
			if (placedQueens[i][j]==true) {
				isValid = false;
			}
			i = i+1;
			j = j+1;
			
		}
		i = row;
		j = col;
		while(i<8 && j>=0) {
			if (placedQueens[i][j]==true) {
				isValid = false;
			}
			i = i+1;
			j = j-1;
			
		}
		i = row;
		j = col;
		while(i>=0 && j<8) {
			if (placedQueens[i][j]==true) {
				isValid = false;
			}
			i = i-1;
			j = j+1;
			
		}
		i = row;
		j = col;
		while(i>=0 && j>=0) {
			if (placedQueens[i][j]==true) {
				isValid = false;
			}
			i = i-1;
			j = j-1;
			
		}
		if (isValid==true) {
			placedQueens[row][col] = true;
			numQueens = numQueens+1;
		}
		return isValid;
	}
}














