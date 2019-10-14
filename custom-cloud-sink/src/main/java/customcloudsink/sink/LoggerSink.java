package customcloudsink.sink;

import lombok.extern.slf4j.Slf4j;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoggerSink {

    @StreamListener(Sink.INPUT)
    public void log(String date) {
        log.info("Received: {}", date);
    }

}
