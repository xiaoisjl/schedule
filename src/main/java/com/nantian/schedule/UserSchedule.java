package com.nantian.schedule;

import com.nantian.schedule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class UserSchedule {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Scheduled(cron="0/5 * * * * ? ")
    public void task1() {
        System.out.println("定时任1");

        String sql = "SELECT ACCT_ID,ACCT_NM FROM SYS_ACCOUNT";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
