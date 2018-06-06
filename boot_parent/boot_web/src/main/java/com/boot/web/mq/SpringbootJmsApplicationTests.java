package com.boot.web.mq;
 
import org.boot.utils.mq.ActiveMqSendUtils;
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.boot.test.context.SpringBootTest;  
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.WebStart;  
  
  
@RunWith(SpringRunner.class)  
@SpringBootTest(classes = WebStart.class)  
public class SpringbootJmsApplicationTests {  
    
    @Test  
    public void testActivemq(){  
    	ActiveMqSendUtils.addMailToMailQueue("我是邮件内容");
    	ActiveMqSendUtils.addSmsToSmsQueue("我是短信内容");
    }  
}  