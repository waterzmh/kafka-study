package org.water.kafkastudy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.water.topic.TopicUtils;

import java.io.*;
import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class TopicTest {

    @Test
    public void createTopic() throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(new File("/Users/zhuminhao/personalProjects/kafka-study/src/main/resources/kafka-config.properties")));
        Properties properties = new Properties();
        properties.load(is);
        TopicUtils.createTopic(properties);
    }

}
