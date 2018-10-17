package cn.majingjing.demo.rabbitmq;

import cn.majingjing.demo.rabbitmq.service.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

	@Autowired
	Sender sender;

	@Test
	public void contextLoads() {
		sender.sendMsg("hello rabbitmq with springboot ...");
	}

}
