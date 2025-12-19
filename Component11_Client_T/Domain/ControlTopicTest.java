package Client.Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ControlTopicTest {

    @Test
    void validateAccessByTopic_basicCall() {
        ControlTopic control = new ControlTopic();

        assertDoesNotThrow(() ->
            control.validateAccessByTopic("Databases", 1234)
        );
    }
}
