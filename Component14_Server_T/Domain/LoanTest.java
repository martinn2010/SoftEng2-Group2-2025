package Domain;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LoanTest {

    @Test
    public void testLoanSettersAndGetters() {
        Loan loan = new Loan();

        loan.set_loanId(10);
        loan.set_userId(20);
        loan.set_itemId(30);
        loan.set_status(true);

        assertEquals(10, loan.get_loanId());
        assertEquals(20, loan.get_userId());
        assertEquals(30, loan.get_itemId());
        assertEquals(true, loan.is_status());
    }
}