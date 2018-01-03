
public class Percolation {
	
	private boolean[][] grid;
	private int nOpenSites = 0;
	private int n;
	
	public Percolation(int n) {
		grid = new boolean[n+1][n+1];
		this.n = n;
	}
	
	public void open(int row, int col) {
		if (!check(row) || !check(col))
			throw new IllegalArgumentException();
		if (!grid[row][col]) {
			grid[row][col] = true;
			nOpenSites++;
		}
	}
	
	public boolean isOpen(int row, int col) {
		if (!check(row) || !check(col))
			throw new IllegalArgumentException();
		return grid[row][col];
	}
	
	public boolean isFull (int row, int col) {
		if (!check(row) || !check(col))
			throw new IllegalArgumentException();
		return false;
	}
	
	public int numberOfOpenSites() {
		return nOpenSites;
	}

	public boolean percolates() {
		return false;
	}
	
	private boolean check(int coord) {
		return coord >= 1 && coord <= n;
	}
	
}
