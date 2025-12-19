package Domain;

import static org.junit.Assert.assertEquals;
import java.sql.Date;
import org.junit.Test;

public class ReturnTest {

    @Test
    public void testReturnSettersAndGetters() {
        Return r = new Return();

        r.set_returnId(5);
        r.set_condition("Good");
        Date date = new Date(System.currentTimeMillis());
        r.set_returnDate(date);

        assertEquals(5, r.get_returnId());
        assertEquals("Good", r.get_condition());
        assertEquals(date, r.get_returnDate());
    }
}