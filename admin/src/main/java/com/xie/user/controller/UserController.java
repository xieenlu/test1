package com.xie.user.controller;

import com.xie.product.ProductApi;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ProductApi productApi;
    static int  i = 0;
    @RequestMapping("getUsers")
    public Map<String,Object> getUsers(){
        Map<String,Object> result = new HashMap<>(2);
        result.put("name","zhangsan");
        result.put("age",19);
        return productApi.getProductInfo().get(0);
    }

    public static void main(String[] args){
        System.out.println(111);
        A();
    }

    public static void A(){

        System.out.println(++i);
        A();
    }

    public void B(){
        A();
    }
}
