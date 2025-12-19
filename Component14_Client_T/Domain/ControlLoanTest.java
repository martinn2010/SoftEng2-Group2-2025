package Client.Domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ControlLoanTest {

    @Test
    void readLoans_returnsNonNullList() {
        ControlLoan controlLoan = new ControlLoan();

        List<?> loans = controlLoan.readLoans(1234);

        assertNotNull(loans);
    }
}
