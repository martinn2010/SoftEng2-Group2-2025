package Presentation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SystemClientUITest {

    @Test
    void testHandleRequestThrowsException() {
        SystemClientUI ui = new SystemClientUI();
        assertThrows(UnsupportedOperationException.class, () -> {
            ui.handleRequest(null, null);
        });
    }

    @Test
    void testSendResponseThrowsException() {
        SystemClientUI ui = new SystemClientUI();
        assertThrows(UnsupportedOperationException.class, () -> {
            ui.sendResponse(null);
        });
    }
}
