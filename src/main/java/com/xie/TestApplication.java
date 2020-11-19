package com.xie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类.
 *
 * @date: 2020-04-07
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@RestController
@SpringBootApplication
@ComponentScan("com.xie")
public class TestApplication {
    @RequestMapping("index")
    public String home(){
        return "this is the first page.";
    }

    public static void main(String[]  args){
        SpringApplication.run(TestApplication.class);
    }
}
