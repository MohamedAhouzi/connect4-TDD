import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GridTest {
    @Test
    public void shouldHave6LinesWhenInitializedGrid(){
        Grid grid = new Grid();
        int result = grid.getLines();
        Assertions.assertEquals(6,result);
    }
}
