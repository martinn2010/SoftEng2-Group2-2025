package Domain;

import org.junit.Test;

public class ControlTopicTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testGetAvailableTopics() {
        ControlTopicTest control = new ControlTopicTest();
        control.testGetAvailableTopics();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetStudyGroupDetails(String criteria) {
        ControlTopicTest control = new ControlTopicTest();
        control.testGetStudyGroupDetails("topicId");
    }
}