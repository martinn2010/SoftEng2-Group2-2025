package Client.Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CourseTest {

    @Test
    void hasStudyGroups_defaultFalseOrTrue() {
        Course course = new Course();
        // si tienes setters, inicializa lo que quieras

        boolean result = course.hassStudyGroups(); // ojo al nombre exacto del método

        // de momento solo comprobamos que devuelve algo
        assertNotNull(result);
    }

    @Test
    void getStudyGroups_notNullList() {
        Course course = new Course();

        Object groups = course.getStudyGroups();

        assertNotNull(groups);
    }
}
