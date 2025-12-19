package Server.Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaterialServiceTest {

    @Test
    void constructor_createsInstance() {
        MaterialServiceTest service = new MaterialServiceTest();
        assertNotNull(service);
    }

    @Test
    void getMaterial_throwsUnsupportedOperationException() {
        MaterialServiceTest service = new MaterialServiceTest();
        assertThrows(UnsupportedOperationException.class,
                () -> service.getMaterial(new Object()));
    }

    @Test
    void search_throwsUnsupportedOperationException() {
        MaterialServiceTest service = new MaterialServiceTest();
        assertThrows(UnsupportedOperationException.class,
                () -> service.search(new Object()));
    }

    @Test
    void getDetail_throwsUnsupportedOperationException() {
        MaterialServiceTest service = new MaterialServiceTest();
        assertThrows(UnsupportedOperationException.class,
                () -> service.getDetail(new Object()));
    }
}
