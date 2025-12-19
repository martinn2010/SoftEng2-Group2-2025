package Persistence;

import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class AgentTest {

    @Test
    public void testCreateThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> agent.create());
    }

    @Test
    public void testUpdateThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> agent.update());
    }

    @Test
    public void testQueryThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> agent.query());
    }
}