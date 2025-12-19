package Client.Presentation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Client.Domain.ControlCourse;
import Client.Domain.ControlTopic;

class StudentUITest {

    @Test
    void sendAccessByCourseRequest_doesNotThrow() {
        ControlCourse controlCourse = new ControlCourse();
        ControlTopic controlTopic = new ControlTopic();
        StudentUI ui = new StudentUI(controlCourse, controlTopic); 

        assertDoesNotThrow(() ->
            ui.sendAccessByCourseRequest(1)
        );
    }

    @Test
    void sendAccessByTopicRequest_doesNotThrow() {
        ControlCourse controlCourse = new ControlCourse();
        ControlTopic controlTopic = new ControlTopic();
        StudentUI ui = new StudentUI(controlCourse, controlTopic);

        assertDoesNotThrow(() ->
            ui.sendAccessByTopicRequest("Databases")
        );
    }
}
