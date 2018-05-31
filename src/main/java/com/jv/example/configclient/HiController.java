package com.jv.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shzhengqin on 2018/5/30
 */
@RestController
public class HiController {

    @Value("${foo}")
    String foo;

    @GetMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
