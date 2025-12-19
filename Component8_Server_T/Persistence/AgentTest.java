package Persistence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AgentTest {

    @Test
    void testFindByIdThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> {
            agent.findById("123");
        });
    }

    @Test
    void testIsReservedByAnotherUserThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> {
            agent.isReservedByAnotherUser("123", "user1");
        });
    }

    @Test
    void testIsActiveThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> {
            agent.isActive("123");
        });
    }

    @Test
    void testHasReachedRenewalLimitThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> {
            agent.hasReachedRenewalLimit("123");
        });
    }

    @Test
    void testRenewLoanThrowsException() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> {
            agent.renewLoan("123");
        });
    }
}