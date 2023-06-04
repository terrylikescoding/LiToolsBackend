package com.litools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.litools.*")
@ComponentScan(basePackages = { "com.litools.*" })
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EntityScan("com.litools.*")
// 需要在application配置文件中配置 https://blog.csdn.net/renkai721/article/details/112257894
public class LitoolsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LitoolsBackendApplication.class, args);
    }

}
