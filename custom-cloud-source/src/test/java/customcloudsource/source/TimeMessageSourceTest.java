package customcloudsource.source;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.messaging.Message;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class TimeMessageSourceTest {

    @SpyBean
    private TimeMessageSource source;

    @Test
    public void receive() {
        Message<Long> message = source.receive();

        assertThat("Message are null!", message, notNullValue(Message.class));
        assertThat("Payload are null!", message.getPayload(), notNullValue(Long.class));
        assertThat("Message are eq 0!", message.getPayload(), not(0));
    }
}