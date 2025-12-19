package Domain;

import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class ControlLoanTest {

    @Test
    public void testManageLoanThrowsException() {
        ControlLoan cl = new ControlLoan();
        assertThrows(UnsupportedOperationException.class, () -> cl.manageLoan(null));
    }

    @Test
    public void testValidateLoanThrowsException() {
        ControlLoan cl = new ControlLoan();
        assertThrows(UnsupportedOperationException.class, () -> cl.validateLoan());
    }
}