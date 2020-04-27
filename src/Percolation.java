public class Percolation {

    private boolean[] grid;
    private int nOpenSites = 0;
    private int n;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        grid = new boolean[n * n];
        this.n = n;
    }

    // open the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (!check(row) || !check(col))
            throw new IllegalArgumentException();
        int flat = flat(row, col);
        if (!grid[flat]) {
            grid[flat] = true;
            nOpenSites++;
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (!check(row) || !check(col))
            throw new IllegalArgumentException();
        return grid[flat(row, col)];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if (!check(row) || !check(col))
            throw new IllegalArgumentException();
        return false;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return nOpenSites;
    }

    // does the system percolates?
    public boolean percolates() {
        return false;
    }

    private boolean check(int coord) {
        return coord >= 1 && coord <= n;
    }

    int flat(int row, int col) {
        return n * (row - 1) + (col - 1);
    }

}
