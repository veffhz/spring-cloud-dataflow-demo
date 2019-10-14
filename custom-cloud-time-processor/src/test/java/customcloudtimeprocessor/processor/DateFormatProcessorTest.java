package customcloudtimeprocessor.processor;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
public class DateFormatProcessorTest {

    @SpyBean
    private DateFormatProcessor processor;

    @Test
    public void convertToCelsius() throws ParseException {
        Object data = processor.transform(1571064646361L);
        String strDate = String.valueOf(data);
        LocalDateTime dateTime = LocalDateTime.parse(strDate);
        assertThat("Date value are not equal!", dateTime,
                is(LocalDateTime.ofInstant(Instant.parse("2019-10-14T14:50:46.361Z"),
                        TimeZone.getDefault().toZoneId())));
    }
}