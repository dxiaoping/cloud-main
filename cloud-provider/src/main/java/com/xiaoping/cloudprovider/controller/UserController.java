package com.xiaoping.cloudprovider.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @description: 用户控制层测试
 * @author: Duan xiaoping
 * @mailbox: xiaoping.duan@powersi.com.cn
 * @create: 2020-07-10 11:13
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/sayHello")
    public String sayhello(){
        return "I`m provider 1 ,Hello consumer!";
    }
    @RequestMapping("/sayHi")
    public String sayHi(){
        return "I`m provider 1 ,Hi consumer!";
    }
    @RequestMapping("/sayHaha")
    public String sayHaha(){
        return "I`m provider 1 ,Haha consumer!";
    }
}
