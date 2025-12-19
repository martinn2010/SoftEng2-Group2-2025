package Server.Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BibliographicMaterialTest {

    @Test
    void constructor_createsInstance() {
        BibliographicMaterialTest material = new BibliographicMaterialTest();
        assertNotNull(material);
    }
}