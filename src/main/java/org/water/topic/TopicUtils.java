package org.water.topic;

import org.apache.kafka.clients.admin.AdminClient;
import org.water.vo.TopicConfigVO;

import java.util.HashSet;
import java.util.Properties;

/**
 * @author water
 * @since 2020/1/14 17:12
 */
public class TopicUtils {
    public static void createTopic(Properties Properties) {
        // 原书提供的类ZkUtils已过期，改为推荐使用的方法
        AdminClient adminClient = null;
        // 配置一些参数，具体可以查看AdminClientConfig的static部分，或者直接查阅文档
        adminClient = AdminClient.create(Properties);
    }
}
