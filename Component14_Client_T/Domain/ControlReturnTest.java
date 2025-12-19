package Client.Domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ControlReturnTest {

    @Test
    void readReturns_returnsNonNullList() {
        ControlReturn controlReturn = new ControlReturn();

        List<?> returns = controlReturn.readReturns(1234);

        assertNotNull(returns);
    }
}
