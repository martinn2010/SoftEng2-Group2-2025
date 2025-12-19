package Client.Persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AgentTest {

    @Test
    void getProxy_shouldThrowUnsupportedOperationExceptionForNow() {
        assertThrows(UnsupportedOperationException.class,
                () -> Agent.getProxy());
    }
}
