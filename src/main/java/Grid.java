public class Grid {
    private  String[][] matrix;
    private static final int ROWS = 6;
    private static final int COLUMNS = 7;

    public Grid(){
        matrix = new String[6][7];
        for (int i=0;i<6;i++)
            for (int j=0;j<7;j++)
                matrix[i][j] = ".";
    }
    public int getRows(){
        return ROWS;
    }

    public int getColumns() {
        return COLUMNS;
    }
    public String getToken(int row, int column) {
        return matrix[row][column];
    }

    public void insertToken(String token, int column) {
        if(column>7) throw new IllegalArgumentException("column should not be greater than 7");
         matrix[5][column] = token;
    }
}
