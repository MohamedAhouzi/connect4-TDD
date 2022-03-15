public class Grid {
    private final String[][] matrix;
    public Grid(){
        matrix = new String[6][7];
        for (int i=0;i<6;i++)
            for (int j=0;j<7;j++)
                matrix[i][j] = ".";
    }
    public int getLines(){
        return 6;
    }

    public int getColumns() {
        return 7;
    }
    public String getToken(int row, int column) {
        return matrix[row - 1][column - 1];
    }
}
