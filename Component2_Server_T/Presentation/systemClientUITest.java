package Server.Presentation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class systemClientUITest {

    @Test
    void constructor_createsInstance() {
        systemClientUITest ui = new systemClientUITest();
        assertNotNull(ui);
    }

    @Test
    void getMaterialsByCourse_throwsUnsupportedOperationException() {
        systemClientUITest ui = new systemClientUITest();
        assertThrows(UnsupportedOperationException.class, ui::getMaterialsByCourse);
    }

    @Test
    void searchMaterials_throwsUnsupportedOperationException() {
        systemClientUITest ui = new systemClientUITest();
        assertThrows(UnsupportedOperationException.class, ui::searchMaterials);
    }

    @Test
    void getMaterialsDetail_throwsUnsupportedOperationException() {
        systemClientUITest ui = new systemClientUITest();
        assertThrows(UnsupportedOperationException.class, ui::getMaterialsDetail);
    }
}