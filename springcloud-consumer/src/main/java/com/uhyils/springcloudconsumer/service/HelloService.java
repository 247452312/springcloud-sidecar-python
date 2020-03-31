package com.uhyils.springcloudconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author uhyils <247452312@qq.com>
 * @date 文件创建日期 2020年03月30日 17时00分
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/java-hi")
    public String javaHi(String name) {
        return "{'status': 'true', 'data': 'hi " + name + "i`m java'}";
    }

    @RequestMapping("/python-hi")
    public String pythonHi(String name) {
        String url = "http://py-sidecar/hi?name=" + name;
        System.out.println(url);
        return restTemplate.getForEntity(url, String.class).getBody();
    }
}