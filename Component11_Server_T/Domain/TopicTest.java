package Domain;

import org.junit.Test;

public class TopicTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testFetchTopics() {
        TopicTest topic = new TopicTest();
        topic.testFetchTopics();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testFetchStudyGroupDetails(String criteria) {
        TopicTest topic = new TopicTest();
        topic.testFetchStudyGroupDetails("topicId");
    }
}