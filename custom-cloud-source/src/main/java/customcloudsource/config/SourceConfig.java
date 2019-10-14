package customcloudsource.config;

import customcloudsource.source.TimeMessageSource;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;


@Configuration
@EnableBinding(Source.class)
public class SourceConfig {

    @Bean
    @InboundChannelAdapter(value = Source.OUTPUT,
            poller = @Poller(fixedDelay = "10000", maxMessagesPerPoll = "1"))
    public MessageSource<Long> timeMessageSource() {
        return new TimeMessageSource();
    }
}
