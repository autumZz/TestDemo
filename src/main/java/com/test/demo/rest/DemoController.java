package com.test.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld() {
        return "helloWorld" ;
    }

}
