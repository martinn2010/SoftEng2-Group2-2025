package Domain;

import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class ControlReturnTest {

    @Test
    public void testManageReturnThrowsException() {
        ControlReturn cr = new ControlReturn();
        assertThrows(UnsupportedOperationException.class, () -> cr.manageReturn(null));
    }

    @Test
    public void testValidateReturnThrowsException() {
        ControlReturn cr = new ControlReturn();
        assertThrows(UnsupportedOperationException.class, () -> cr.validateReturn());
    }
}