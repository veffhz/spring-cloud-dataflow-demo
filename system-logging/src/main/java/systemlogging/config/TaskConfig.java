package systemlogging.config;

import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import systemlogging.task.SystemLogTask;

@EnableTask
@Configuration
public class TaskConfig {

    @Bean
    public SystemLogTask customSystemLog() {
        return new SystemLogTask();
    }
}
