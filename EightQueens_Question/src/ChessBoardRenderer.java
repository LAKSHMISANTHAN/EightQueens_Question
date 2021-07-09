public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		System.out.println(square);
		int c = square/8;
		int r = square%8;
		if(c%2==0 && r%2!=0) {
			return true;
		}
		if(c%2!=0 && r%2==0) {
			return true;
		}
		return false;
	}
}
