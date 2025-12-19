package Domain;

import org.junit.Test;

public class ControlCourseTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testGetAvailableCourses() {
        ControlCourseTest control = new ControlCourseTest();
        control.testGetAvailableCourses();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetStudyGroupDetails(String criteria) {
        ControlCourseTest control = new ControlCourseTest();
        control.testGetStudyGroupDetails("courseId");
    }
}
