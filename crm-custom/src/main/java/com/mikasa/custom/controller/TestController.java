package com.mikasa.custom.controller;

import com.mikasa.custom.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName TestController
 * @description
 * @author: tianluhua
 * @date 2019/4/19 12:38
 */
@Controller
@RequestMapping(value = "testController")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public List<String> test1() {
        System.out.println("====");
        return testService.getCityName();
    }


}
