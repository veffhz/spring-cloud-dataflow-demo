package customcloudsource.source;

import lombok.extern.slf4j.Slf4j;

import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Slf4j
public class TimeMessageSource implements MessageSource<Long> {

    @Override
    public Message<Long> receive() {
        return MessageBuilder.withPayload(
                LocalDateTime
                        .now()
                        .atZone(ZoneId.systemDefault())
                        .toInstant()
                        .toEpochMilli())
                .build();
    }
}
