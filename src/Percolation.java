
public class Percolation {
	
	private boolean[] grid;
	private int nOpenSites = 0;
	private int n;
	
	public Percolation(int n) {
		grid = new boolean[n*n];
		this.n = n;
	}
	
	public void open(int row, int col) {
		if (!check(row) || !check(col))
			throw new IllegalArgumentException();
		int flat = flat(row, col);
		if (!grid[flat]) {
			grid[flat] = true;
			nOpenSites++;
		}
	}
	
	public boolean isOpen(int row, int col) {
		if (!check(row) || !check(col))
			throw new IllegalArgumentException();
		return grid[flat(row, col)];
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
	
	int flat(int row, int col) {
		return n*(row-1) + (col-1);
	}
	
}
