package Client.Presentation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentUITest {

    @Test
    void getMaterialsByCourse_shouldThrowUnsupportedOperationExceptionForNow() {
        StudentUI ui = new StudentUI();

        assertThrows(UnsupportedOperationException.class,
                () -> ui.getMaterialsByCourse());
    }

    @Test
    void searchMaterials_shouldThrowUnsupportedOperationExceptionForNow() {
        StudentUI ui = new StudentUI();

        assertThrows(UnsupportedOperationException.class,
                () -> ui.searchMaterials());
    }

    @Test
    void getMaterialsDetail_shouldThrowUnsupportedOperationExceptionForNow() {
        StudentUI ui = new StudentUI();

        assertThrows(UnsupportedOperationException.class,
                () -> ui.getMaterialsDetail());
    }
}
