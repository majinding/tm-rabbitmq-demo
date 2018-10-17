package cn.majingjing.demo.rabbitmq.service;

import cn.majingjing.demo.rabbitmq.config.Iconstans;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by JingjingMa on 2018/10/17 11:13
 */
@Component
public class Receive {

    @RabbitListener(queues = Iconstans.queueName)//监听器监听指定的Queue
    public void handler(String str) {
        System.out.println("Receive:" + str);
    }

}
