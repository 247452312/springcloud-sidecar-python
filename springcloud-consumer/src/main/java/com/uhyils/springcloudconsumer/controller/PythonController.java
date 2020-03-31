package com.uhyils.springcloudconsumer.controller;

import com.uhyils.springcloudconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author uhyils <247452312@qq.com>
 * @date 文件创建日期 2020年03月30日 17时00分
 */
@RestController
public class PythonController {


    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/python-hi")
    public String hi(@RequestParam String name) {
        return helloService.pythonHi(name);
    }
    @RequestMapping(value = "/java-hi")
    public String javahi(@RequestParam String name) {
        return helloService.javaHi(name);
    }
}
