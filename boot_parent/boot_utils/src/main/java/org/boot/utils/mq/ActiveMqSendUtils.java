package org.boot.utils.mq;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsTemplate;

public class ActiveMqSendUtils {
	  
    private static JmsTemplate jmsTemplate;
	
	public static void setJmsTemplate(JmsTemplate jmsTemplate){
		ActiveMqSendUtils.jmsTemplate=jmsTemplate;
	}
	/**
	 * 创建邮件队列
	 */
    public static Queue mailQueue=new ActiveMQQueue("mail_queue"); 
    /**
	 * 创建短信队列
	 */
    public static Queue smsQueue=new ActiveMQQueue("sms_queue");
    
    
    /**
     * 将任务添加到mail_queue队列
     * @param mailContent
     */
    public static void addMailToMailQueue(String mailContent){
    	jmsTemplate.convertAndSend(mailQueue, mailContent);
    }
    
    /**
     * 将任务添加到sms_queue队列
     * @param smsContent
     */
    public static void addSmsToSmsQueue(String smsContent){
    	jmsTemplate.convertAndSend(smsQueue, smsContent);
    }
}
