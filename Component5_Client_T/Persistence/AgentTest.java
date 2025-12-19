package Client.Persistence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AgentTest {

    @Test
    void testGetProxy() {
        Agent agent = new Agent();
        assertNotNull(agent.getProxy());
    }
}
