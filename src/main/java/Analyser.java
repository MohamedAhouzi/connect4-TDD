public class Analyser {

    private final GridMock gridMock;

    public Analyser(GridMock gridMock) {
        this.gridMock = gridMock;
    }

    public String checkForWinner() {
        final String[][] columns = gridMock.getColumns();
        int counter = 1;
        for(int i=0;i<columns.length;i++) {
            for (int j = 0; j < columns[i].length-1; j++) {
                if (columns[i][j].equals(columns[i][j + 1]) && !columns[i][j].equals("."))
                    counter ++;
                else counter=1;
                if (counter == 4) return columns[i][j];
            }
            counter=1;
        }
        return "";
    }
}
