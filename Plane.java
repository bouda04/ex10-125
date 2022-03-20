import java.util.Arrays;

public class Plane {
	boolean[][] seats;
	
	public Plane(int rows, int cols) {
		this.seats = new boolean[rows][cols];
	}
	
	public boolean order(int row, char col) {
		int icol = col-'A';
		if (seats[row-1][icol]==true)
			return false;
		else {
			seats[row-1][icol] = true;
			return true;
		}
	}

	@Override
	public String toString() {
		String result="";
		for (int i=0;i<seats.length;i++) {
			for (int j=0;j<seats[i].length;j++) {
				result += seats[i][j]?"N ":"A ";
			}
			result += '\n';
		}
		return result;
	}
	

}
