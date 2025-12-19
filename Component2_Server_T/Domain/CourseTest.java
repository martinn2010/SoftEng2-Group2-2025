package Server.Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CourseTest {

    @Test
    void constructor_createsInstance() {
        CourseTest course = new CourseTest();
        assertNotNull(course);
    }
}
