package Client.Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ControlCourseTest {

    @Test
    void validateAccessByCourse_basicCall() {
        ControlCourse control = new ControlCourse();

        assertDoesNotThrow(() ->
            control.validateAccessByCourse(1, 1234)
        );
    }
}
