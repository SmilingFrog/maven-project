package learning;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MessengerTest {
    @Test
    public void canReturnMessage() throws Exception {
        String message = getMessage();
        assertNotNull(message);
    }

    public String getMessage() {
        return "message";
    }
}
