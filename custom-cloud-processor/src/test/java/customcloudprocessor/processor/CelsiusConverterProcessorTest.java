package customcloudprocessor.processor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.eq;

@RunWith(SpringRunner.class)
public class CelsiusConverterProcessorTest {

    @SpyBean
    private CelsiusConverterProcessor processor;

    @Test
    public void convertToCelsius() {
        int celsius = processor.convertToCelsius("212");
        assertThat("Celsius values are not equal!", celsius, is(100));
    }
}