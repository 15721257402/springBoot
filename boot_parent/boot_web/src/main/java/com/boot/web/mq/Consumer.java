package com.boot.web.mq;

import javax.jms.JMSException;  
import javax.jms.Session;  
import javax.jms.TextMessage;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.jms.annotation.JmsListener;  
import org.springframework.stereotype.Component;  
  
@Component  
public class Consumer {  
  
    private final static Logger logger = LoggerFactory.getLogger(Consumer.class);  
      
    @JmsListener(destination = "mail_queue", containerFactory = "jmsQueueListener")  
    public void receiveMailQueue(final TextMessage text, Session session)  
            throws JMSException {  
        try {  
            logger.info("Consumer收到的报文为:" + text.getText());  
            text.acknowledge();// 使用手动签收模式，需要手动的调用，如果不在catch中调用session.recover()消息只会在重启服务后重发  
        } catch (Exception e) {   
           session.recover();// 此不可省略 重发信息使用  
        }  
    } 
    
    @JmsListener(destination = "sms_queue", containerFactory = "jmsQueueListener")  
    public void receiveSmsQueue(final TextMessage text, Session session)  
            throws JMSException {  
        try {  
            logger.info("Consumer收到的报文为:" + text.getText());  
            text.acknowledge();// 使用手动签收模式，需要手动的调用，如果不在catch中调用session.recover()消息只会在重启服务后重发  
        } catch (Exception e) {   
           session.recover();// 此不可省略 重发信息使用  
        }  
    }  
}  
