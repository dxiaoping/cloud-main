package com.xiaoping.cloudconsumer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * @description: 消费者控制层测试
 * @author: Duan xiaoping
 * @mailbox: xiaoping.duan@powersi.com.cn
 * @create: 2020-07-10 11:28
 */

@RestController
public class HelloController {

    @Bean
    @LoadBalanced
    public RestTemplate getResttemplate(){
        return new RestTemplate();
    }
    //用于发送url请求
    @Autowired
    private RestTemplate resttemplate;

    @RequestMapping("/hello")
    public String hello(){
        //指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
        String url="http://cloud-provider-user/user/sayHello";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);

    }
    @RequestMapping("/hi")
    public String hi(){
        //指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
        String url="http://cloud-provider-user/user/sayHi";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);

    }
    @RequestMapping("/haha")
    public String haha(){
        //指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
        String url="http://cloud-provider-user/user/sayHaha";
        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);

    }
}
