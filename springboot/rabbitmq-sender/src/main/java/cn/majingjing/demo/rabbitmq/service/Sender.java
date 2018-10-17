package cn.majingjing.demo.rabbitmq.service;

import cn.majingjing.demo.rabbitmq.config.Iconstans;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by JingjingMa on 2018/10/17 10:58
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate template;

    public void sendMsg(String msg) {
        System.out.println("开始发送mq消息:  "+msg);
        template.convertAndSend(Iconstans.queueName,msg);
    }
}
