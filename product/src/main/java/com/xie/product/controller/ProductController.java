package com.xie.product.controller;

import com.xie.product.ProductApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * .
 *
 * @date: 2020-11-23
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */

public class ProductController implements ProductApi {
    @Override
    public List<Map<String, Object>> getProductInfo() {
        List<Map<String,Object>> result = new ArrayList<>();
        Map<String,Object> map = new HashMap<>(16);
        map.put("name","zhangsan");
        map.put("age","18");
        result.add(map);
        return result;
    }
}
