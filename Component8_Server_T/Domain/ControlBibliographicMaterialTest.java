package Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ControlBibliographicMaterialTest {

    @Test
    void testValidateRenewalRequestThrowsException() {
        ControlBibliographicMaterial control = new ControlBibliographicMaterial();
        assertThrows(UnsupportedOperationException.class, () -> {
            control.validateRenewalRequest("loan123", "user456");
        });
    }

    @Test
    void testCheckReservationStatusThrowsException() {
        ControlBibliographicMaterial control = new ControlBibliographicMaterial();
        assertThrows(UnsupportedOperationException.class, control::checkReservationStatus);
    }

    @Test
    void testCheckActiveStatusThrowsException() {
        ControlBibliographicMaterial control = new ControlBibliographicMaterial();
        assertThrows(UnsupportedOperationException.class, control::checkActiveStatus);
    }

    @Test
    void testCheckRenewalLimitThrowsException() {
        ControlBibliographicMaterial control = new ControlBibliographicMaterial();
        assertThrows(UnsupportedOperationException.class, control::checkRenewalLimit);
    }

    @Test
    void testProcessRenewalThrowsException() {
        ControlBibliographicMaterial control = new ControlBibliographicMaterial();
        assertThrows(UnsupportedOperationException.class, control::processRenewal);
    }
}
