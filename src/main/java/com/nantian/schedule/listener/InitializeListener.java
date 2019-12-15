package com.nantian.schedule.listener;

import com.nantian.schedule.UserSchedule;
import com.nantian.schedule.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitializeListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("加載");
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService bean = context.getBean(UserService.class);
//        bean.add();
    }
}
