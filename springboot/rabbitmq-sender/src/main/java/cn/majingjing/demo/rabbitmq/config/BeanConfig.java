package cn.majingjing.demo.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JingjingMa on 2018/10/17 10:56
 */
@Configuration
public class BeanConfig {
    @Bean
    public Queue queue() {
        return new Queue(Iconstans.queueName);
    }
}
