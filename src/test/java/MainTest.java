import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {


    @Test
    public void testSum() {
        Main main = new Main();
        int result = main.sum(2,2);
        assertEquals(5,result);
    }
}
