package org.water.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * @author water
 * @since 2020/1/14 17:53
 */
@PropertySource("classpath:kafka-config.properties")
@Data
public class TopicConfigVO {

    /**
     * 集群地址
     */
    @Value("${bootstrap.servers}")
    private String bootstrapServers;

}
