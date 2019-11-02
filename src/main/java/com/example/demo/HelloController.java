package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * <Description> <br>
 *
 * @author zhang.yifei4<br>
 * @Date 16:07 2019/10/30
 * @see com.example.demo
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World!";
    }
}
