package Client.Domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class LoanTest {

    @Test
    void loadLoans_returnsNonNullList() {
        Loan loan = new Loan();

        List<?> result = loan.loadLoans(1234);

        assertNotNull(result);
    }
}
