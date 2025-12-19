package Client.Presentation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Client.Domain.ControlLoan;
import Client.Domain.ControlReturn;

class StudentUITest {

    @Test
    void sendManageLoansAndReturnsRequest_withLoanAction_doesNotThrow() {
        ControlLoan controlLoan = new ControlLoan();
        ControlReturn controlReturn = new ControlReturn();
        StudentUI ui = new StudentUI(controlLoan, controlReturn);

        assertDoesNotThrow(() ->
            ui.sendManageLoansAndReturnsRequest(1234, "loan")
        );
    }

    @Test
    void sendManageLoansAndReturnsRequest_withReturnAction_doesNotThrow() {
        ControlLoan controlLoan = new ControlLoan();
        ControlReturn controlReturn = new ControlReturn();
        StudentUI ui = new StudentUI(controlLoan, controlReturn);

        assertDoesNotThrow(() ->
            ui.sendManageLoansAndReturnsRequest(1234, "return")
        );
    }
}
