package Client.Persistence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgentTest {

    @Test
    void getProxy_notNull() {
        Agent agent = new Agent();

        Object proxy = agent.getProxy();

        assertNotNull(proxy);
    }
}
