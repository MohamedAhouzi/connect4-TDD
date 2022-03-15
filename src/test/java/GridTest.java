import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {
    Grid grid;
    @BeforeEach
    public void setUp(){
        grid = new Grid();
    }
    @Test
    public void shouldHave6LinesWhenInitializedGrid(){

        int result = grid.getLines();
        assertEquals(6,result);
    }
    @Test
    public void shouldHave7ColumnsWhenInitializedGrid(){
        int result = grid.getColumns();
        assertEquals(7,result);
    }

    @Test
    public void gridShouldBeInitializedWithPoints(){
       for (int i=0;i<6;i++) {
           for (int j = 0; j < 7; j++) {
               String result = grid.getToken(i + 1, j + 1);
               assertEquals(".",result);
           }
       }

    }
}
