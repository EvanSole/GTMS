package com.zzhw.gtms.base.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;


public class GtmsBaseDubboProviderMain {

    static Logger _LOG = Logger.getLogger(GtmsBaseDubboProviderMain.class.getName());

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:base/spring-core.xml");
        context.start();
        System.out.println("GtmsBaseMainServer start------" + System.getProperty("spring.profiles.active"));
        new CountDownLatch(1).await();
    }
}
