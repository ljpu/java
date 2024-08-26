//package com.lpu.demo.controller;
package com.lpu.webtest.controller;

import com.lpu.webtest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public String sayHello() {
        return helloService.getGreeting();
    }
}