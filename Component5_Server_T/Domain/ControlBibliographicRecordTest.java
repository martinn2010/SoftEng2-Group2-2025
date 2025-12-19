package Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ControlBibliographicRecordTest {

    @Test
    void testCreateRecordThrowsException() {
        ControlBibliographicRecord control = new ControlBibliographicRecord();
        assertThrows(UnsupportedOperationException.class, () -> {
            control.createRecord(null);
        });
    }

    @Test
    void testUpdateRecordThrowsException() {
        ControlBibliographicRecord control = new ControlBibliographicRecord();
        assertThrows(UnsupportedOperationException.class, () -> {
            control.updateRecord(null, null);
        });
    }

    @Test
    void testDeleteRecordThrowsException() {
        ControlBibliographicRecord control = new ControlBibliographicRecord();
        assertThrows(UnsupportedOperationException.class, () -> {
            control.deleteRecord(null);
        });
    }
}
