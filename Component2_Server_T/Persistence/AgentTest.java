package Server.Persistence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AgentTest {

    @Test
    void constructor_throwsUnsupportedOperationException() {
        assertThrows(UnsupportedOperationException.class, AgentTest::new);
    }
}