package customcloudprocessor.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CelsiusConverterProcessor {

    @Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
    public int convertToCelsius(String payload) {
        log.info("Got the input as {}", payload);
        int fahrenheitTemperature = Integer.parseInt(payload);
        return (fahrenheitTemperature - 32) * 5 / 9;
    }
}
