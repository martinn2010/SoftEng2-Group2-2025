package Client.Domain

public class LibraryMaterialTest {

    @Test
    void testChecks() {
        LibraryMaterial mat = new LibraryMaterial(false, true, 0, 3);

        assertTrue(mat.checkReservationStatus());
        assertTrue(mat.checkActiveStatus());
        assertTrue(mat.checkRenewalLimit());
    }

    @Test
    void testProcessRenewalSuccess() {
        LibraryMaterial mat = new LibraryMaterial(false, true, 1, 3);
        assertTrue(mat.processRenewal());
    }

    @Test
    void testProcessRenewalFail() {
        LibraryMaterial mat = new LibraryMaterial(true, true, 1, 3); // reserved
        assertFalse(mat.processRenewal());
    }
}
