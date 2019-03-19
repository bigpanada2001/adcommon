package org.adcommon;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages ="org.adcommon")
//@ComponentScan(value = {"com.duowan.taskReRun.action,com.duowan.taskReRun.service,com.duowan.taskReRun.dao"})
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
//@EnableAutoConfiguration(exclude={SecurityAutoConfiguration.class})
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = run(App.class, args);
    }

}
