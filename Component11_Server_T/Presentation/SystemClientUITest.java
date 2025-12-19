package Presentation;

import org.junit.Test;

public class SystemClientUITest {

    @Test(expected = UnsupportedOperationException.class)
    public void testRequestAccessToStudyGroups() {
        SystemClientUITest ui = new SystemClientUITest();
        ui.testRequestAccessToStudyGroups();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAskCriteriaSelection() {
        SystemClientUITest ui = new SystemClientUITest();
        ui.testAskCriteriaSelection();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDisplayCoursesList() {
        SystemClientUITest ui = new SystemClientUITest();
        ui.testDisplayCoursesList();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDisplayTopicsList() {
        SystemClientUITest ui = new SystemClientUITest();
        ui.testDisplayTopicsList();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDisplayStudyGroupDetails() {
        SystemClientUITest ui = new SystemClientUITest();
        ui.testDisplayStudyGroupDetails();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetUserSelection() {
        SystemClientUITest ui = new SystemClientUITest();
        ui.testGetUserSelection();
    }
}