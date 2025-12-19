package Client.Presentation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentUITest {

    @Test
    void testShowConfirmation() {
        StudentUI ui = new StudentUI();
        assertDoesNotThrow(() -> ui.showConfirmation());
    }

    @Test
    void testShowError() {
        StudentUI ui = new StudentUI();
        assertDoesNotThrow(() -> ui.showError("error"));
    }
}
