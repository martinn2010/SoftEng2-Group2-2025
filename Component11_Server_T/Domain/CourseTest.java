package Domain;

import org.junit.Test;

public class CourseTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testFetchCourses() {
        CourseTest course = new CourseTest();
        course.testFetchCourses();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testFetchStudyGroupDetails(String criteria) {
        CourseTest course = new CourseTest();
        course.testFetchStudyGroupDetails("courseId");
    }
}