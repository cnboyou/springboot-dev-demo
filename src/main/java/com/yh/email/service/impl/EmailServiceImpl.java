package com.yh.email.service.impl;

import com.yh.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * ClassName: EmailServiceImpl
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 15:36
 * @Description: TODO
 */
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;

    @Autowired
    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmail(){

        SimpleMailMessage message = new SimpleMailMessage();
        // 发件人
        message.setFrom("xxx@126.com");
        // 收件人
        message.setTo("xxx@163.com");
        // 邮件标题
        message.setSubject("Java发送邮件第二弹");
        // 邮件内容
        message.setText("你好，这是一条用于测试Spring Boot邮件发送功能的邮件！哈哈哈~~~");
        // 抄送人
        message.setCc("xxx@qq.com");
        mailSender.send(message);
    }

}