package Client.Domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MaterialServiceTest {

    @Test
    void getMaterial_shouldThrowUnsupportedOperationExceptionForNow() {
        MaterialService service = new MaterialService();

        assertThrows(UnsupportedOperationException.class,
                () -> service.getMaterial(1));
    }

    @Test
    void search_shouldThrowUnsupportedOperationExceptionForNow() {
        MaterialService service = new MaterialService();

        assertThrows(UnsupportedOperationException.class,
                () -> service.search("criteria"));
    }

    @Test
    void getDetail_shouldThrowUnsupportedOperationExceptionForNow() {
        MaterialService service = new MaterialService();

        assertThrows(UnsupportedOperationException.class,
                () -> service.getDetail(1));
    }
}

