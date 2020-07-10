package com.xiaoping.cloudservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerEurekaApplication.class, args);
        System.out.println("---服务监控访问地址" + "http://localhost:7315");
    }
}
