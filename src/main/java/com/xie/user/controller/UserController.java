package com.xie.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * .
 *
 * @date: 2020-11-19
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("getUsers")
    public Map<String,Object> getUsers(){
        Map<String,Object> result = new HashMap<>(2);
        result.put("name","zhangsan");
        result.put("age",19);
        return result;
    }
}
