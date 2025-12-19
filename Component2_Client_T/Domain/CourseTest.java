package Client.Domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CourseTest {

    @Test
    void constructor_shouldCreateNonNullInstance() {
        Course course = new Course();

        assertNotNull(course, "Course default constructor should create a non-null instance");
    }
}
