package Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BibliographicRecordTest {

    @Test
    void testGettersAndSetters() {
        BibliographicRecord record = new BibliographicRecord();

        record.set_id("1");
        record.set_tittle("Test Title");
        record.set_author("Author");
        record.set_year(2024);

        assertEquals("1", record.get_id());
        assertEquals("Test Title", record.get_tittle());
        assertEquals("Author", record.get_author());
        assertEquals(2024, record.get_year());
    }
}