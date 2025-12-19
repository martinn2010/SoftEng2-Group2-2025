package Persistence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AgentTest {

    @Test
    void testInsertThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> {
            agent.insert(null);
        });
    }

    @Test
    void testUpdateThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> {
            agent.update(null);
        });
    }

    @Test
    void testDeleteThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> {
            agent.delete(null);
        });
    }
}
