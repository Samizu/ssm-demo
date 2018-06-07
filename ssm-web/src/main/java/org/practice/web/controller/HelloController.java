package org.practice.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.practice.web.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by sanshui on 2018/6/7.
 */
@Controller
@RequestMapping("/Hello")
@Slf4j
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping(value = "/hello")
    @ResponseBody
    public String test(){
        return helloService.hello();
    }

}
