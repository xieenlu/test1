package com.xie.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

/**
 * .
 *
 * @date: 2020-11-20
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@FeignClient(name="product-api")
public interface ProductApi {
    @PostMapping("/getUsers")
    List<Map<String,Object>> getProductInfo();
}
