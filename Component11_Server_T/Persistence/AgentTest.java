package Persistence;

import org.junit.Test;

public class AgentTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testQueryCourses() {
        AgentTest agent = new AgentTest();
        agent.testQueryCourses();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testQueryTopics() {
        AgentTest agent = new AgentTest();
        agent.testQueryTopics();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testQueryStudyGroupDetailsByCourse(String criteria) {
        AgentTest agent = new AgentTest();
        agent.testQueryStudyGroupDetailsByCourse("courseId");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testQueryStudyGroupDetailsByTopic(String criteria) {
        AgentTest agent = new AgentTest();
        agent.testQueryStudyGroupDetailsByTopic("topicId");
    }
}