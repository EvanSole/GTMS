package com.zzhw.gtms.order;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;


public class GtmsOrderDubboProviderMain {

    static Logger _LOG = Logger.getLogger(GtmsOrderDubboProviderMain.class.getName());

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:order/spring-core.xml");
        context.start();
        System.out.println("GtmsOrderDubboProviderMain start------" + System.getProperty("spring.profiles.active"));
        new CountDownLatch(1).await();
    }
}
