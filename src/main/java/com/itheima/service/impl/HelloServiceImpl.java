package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: shiwei zhao
 * @create: 2020-02-29 11:15
 */
//阿里巴巴提供的dubbo专用service注解远程调用发布服务
    //解决接口不匹配的问题                                    随机负载均衡
@Service(interfaceClass = HelloService.class,loadbalance = "random")
@Transactional
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello: "+name;
    }
}