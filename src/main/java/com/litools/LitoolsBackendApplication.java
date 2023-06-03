package com.litools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
// 需要在application配置文件中配置 https://blog.csdn.net/renkai721/article/details/112257894
public class LitoolsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LitoolsBackendApplication.class, args);
    }

}
