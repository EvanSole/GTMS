package com.zzhw.gtms.autoid.service;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoIdDubboProviderMain {

	static Logger _LOG = LoggerFactory.getLogger(AutoIdDubboProviderMain.class);

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:autoId/spring-core.xml");
		context.start();
        System.out.println("AutoIdServer start------" + System.getProperty("spring.profiles.active"));
		new CountDownLatch(1).await();
	}
}
