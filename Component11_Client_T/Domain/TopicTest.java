package Client.Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TopicTest {

    @Test
    void hasStudyGroups_defaultValue() {
        Topic topic = new Topic();

        boolean result = topic.hassStudyGroups();

        assertNotNull(result);
    }

    @Test
    void getStudyGroups_notNullList() {
        Topic topic = new Topic();

        Object groups = topic.getStudyGroups();

        assertNotNull(groups);
    }
}
