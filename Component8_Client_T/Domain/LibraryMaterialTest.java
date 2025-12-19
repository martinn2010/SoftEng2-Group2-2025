package Client.Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LibraryMaterialTest {

    @Test
    void testCheckReservationStatus() {
        LibraryMaterial material = new LibraryMaterial(false, true, 0, 3);
        assertTrue(material.checkReservationStatus());

        LibraryMaterial reserved = new LibraryMaterial(true, true, 0, 3);
        assertFalse(reserved.checkReservationStatus());
    }

    @Test
    void testCheckActiveStatus() {
        LibraryMaterial active = new LibraryMaterial(false, true, 0, 3);
        assertTrue(active.checkActiveStatus());

        LibraryMaterial inactive = new LibraryMaterial(false, false, 0, 3);
        assertFalse(inactive.checkActiveStatus());
    }

    @Test
    void testCheckRenewalLimit() {
        LibraryMaterial mat = new LibraryMaterial(false, true, 1, 3);
        assertTrue(mat.checkRenewalLimit());

        LibraryMaterial over = new LibraryMaterial(false, true, 3, 3);
        assertFalse(over.checkRenewalLimit());
    }

    @Test
    void testProcessRenewal() {
        LibraryMaterial mat = new LibraryMaterial(false, true, 1, 3);
        assertTrue(mat.processRenewal());

        LibraryMaterial invalid = new LibraryMaterial(true, true, 1, 3);
        assertFalse(invalid.processRenewal());
    }
}
