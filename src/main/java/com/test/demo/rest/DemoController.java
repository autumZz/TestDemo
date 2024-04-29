package com.test.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // SpotBugs 规则违反：不恰当的字符串比较使用 ==
    // PMD 规则违反：硬编码的字符串字面值
    // CheckStyle 规则违反：魔术数字
    private static final String MAGIC_STRING = "helloWorld";

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld() {
        String response = "helloWorld";
        if (response == MAGIC_STRING) { // 这里使用 == 来比较字符串，这是不正确的
            return response;
        }
        return response;
    }
    public interface MyInterface {
  void process(final Object arg); // Avoid using final here
    }
    @RequestMapping(value = "/buggyCode", method = RequestMethod.GET)
    public String buggyCode() {
        Object obj = null;
        if (Math.random() > 0.5) {
            obj = new Object();
        }
        return obj.toString(); // 这里有潜在的空指针解引用
    }

}
