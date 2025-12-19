package Presentation;

import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class SystemClientUITest {

    @Test
    public void testInitiateManageRequestThrowsException() {
        SystemClientUI ui = new SystemClientUI();
        assertThrows(UnsupportedOperationException.class, () -> ui.initiateManageRequest(null));
    }

    @Test
    public void testCheckClassThrowsException() {
        SystemClientUI ui = new SystemClientUI();
        assertThrows(UnsupportedOperationException.class, () -> ui.checkClass(null));
    }

    @Test
    public void testShowResultThrowsException() {
        SystemClientUI ui = new SystemClientUI();
        assertThrows(UnsupportedOperationException.class, () -> ui.showResult());
    }
}