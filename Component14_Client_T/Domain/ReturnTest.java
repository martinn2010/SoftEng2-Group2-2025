package Client.Domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ReturnTest {

    @Test
    void loadReturns_returnsNonNullList() {
        Return ret = new Return();

        List<?> result = ret.loadReturns(1234);

        assertNotNull(result);
    }
}
