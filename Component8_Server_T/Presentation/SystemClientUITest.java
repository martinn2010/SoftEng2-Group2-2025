package Presentation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SystemClientUITest {

    @Test
    void testSendRenewRequestThrowsException() {
        SystemClientUI ui = new SystemClientUI();
        assertThrows(UnsupportedOperationException.class, ui::sendRenewRequest);
    }

    @Test
    void testShowConfirmationThrowsException() {
        SystemClientUI ui = new SystemClientUI();
        assertThrows(UnsupportedOperationException.class, ui::showConfirmation);
    }

    @Test
    void testShowErrorThrowsException() {
        SystemClientUI ui = new SystemClientUI();
        assertThrows(UnsupportedOperationException.class, () -> {
            ui.showError("Error message");
        });
    }
}
