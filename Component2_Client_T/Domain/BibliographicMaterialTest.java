package Client.Domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BibliographicMaterialTest {

    @Test
    void constructor_shouldCreateNonNullInstance() {
        BibliographicMaterial material = new BibliographicMaterial();

        assertNotNull(material, "Default constructor should create a non-null BibliographicMaterial instance");
    }
}
