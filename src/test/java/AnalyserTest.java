import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AnalyserTest {

    GridMock gridMock = Mockito.mock(GridMock.class);
    Analyser analyser = new Analyser(gridMock);

    @Test
    public void shouldReturnRIfThereIs4SuccessiveRInLastColumn(){
        String[][] expected = {
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {"R", "R", "R", "R", ".", ".", "."},
        };
        Mockito.when(gridMock.getColumns()).thenReturn(expected);
        String winner = analyser.checkForWinner();
        Assertions.assertEquals("R",winner);
    }
    @Test
    public void shouldReturnJIfThereIs4SuccessiveJInLastColumn(){
        String[][] expected = {
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {"J", "J", "J", "J", ".", ".", "."},
        };
        Mockito.when(gridMock.getColumns()).thenReturn(expected);
        String winner = analyser.checkForWinner();
        Assertions.assertEquals("J",winner);
    }
    @Test
    public void shouldReturnTokenIfThereIs4SuccessiveTokensInAColumn(){
        String[][] expected = {
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {"J", "J", "J", "J", ".", ".", "."},
                {"R", "J", "R", "R", ".", ".", "."},
        };
        Mockito.when(gridMock.getColumns()).thenReturn(expected);
        String winner = analyser.checkForWinner();
        Assertions.assertEquals("J",winner);
    }
    @Test
    public void shouldReturnNothingIfThereIsNoWinner(){
        String[][] expected = {
                {".", ".", ".", ".", ".", ".", "."},
                {".", "R", "R", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {"R", "R", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", "R", "R", ".", ".", "."},
        };
        Mockito.when(gridMock.getColumns()).thenReturn(expected);
        String winner = analyser.checkForWinner();
        Assertions.assertEquals("",winner);
    }

    @Test
    public void shouldReturn(){
        String[][] expected = {
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {"R", "R", ".", "R", "R", "R", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
        };
        Mockito.when(gridMock.getColumns()).thenReturn(expected);
        String winner = analyser.checkForWinner();
        Assertions.assertEquals("",winner);
    }
    @Test
    public void shouldReturn1(){
        String[][] expected = {
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {"R", "R", "J", "R", "R", "R", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
        };
        Mockito.when(gridMock.getColumns()).thenReturn(expected);
        String winner = analyser.checkForWinner();
        Assertions.assertEquals("",winner);
    }

    @Test
    public void shouldReturn2(){
        String[][] expected = {
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", "R", "R", "R"},
                {"R", "R", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
        };
        Mockito.when(gridMock.getColumns()).thenReturn(expected);
        String winner = analyser.checkForWinner();
        Assertions.assertEquals("",winner);
    }

}
