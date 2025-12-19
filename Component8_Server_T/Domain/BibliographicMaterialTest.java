package Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BibliographicMaterialTest {

    @Test
    void testIsReservedByOtherUserThrowsException() {
        BibliographicMaterial mat = new BibliographicMaterial();
        assertThrows(UnsupportedOperationException.class, mat::isReservedByOtherUser);
    }

    @Test
    void testIsActiveThrowsException() {
        BibliographicMaterial mat = new BibliographicMaterial();
        assertThrows(UnsupportedOperationException.class, mat::isActive);
    }

    @Test
    void testCanBeRenewedThrowsException() {
        BibliographicMaterial mat = new BibliographicMaterial();
        assertThrows(UnsupportedOperationException.class, mat::canBeRenewed);
    }

    @Test
    void testRenewLoanThrowsException() {
        BibliographicMaterial mat = new BibliographicMaterial();
        assertThrows(UnsupportedOperationException.class, mat::renewLoan);
    }
}