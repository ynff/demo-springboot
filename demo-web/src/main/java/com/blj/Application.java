package com.blj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by blj on 2017/10/31.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.blj"})
@ServletComponentScan
//@EnableAutoConfiguration  //该注解将自动载入你所使用的bean
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
