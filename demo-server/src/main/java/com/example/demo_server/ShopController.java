package com.example.demo_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Value("${spring.datasource.url}")
    private String exampleProperty;

    @GetMapping("/get-config")
    public String getConfig() {
        return "Configuration property value: " + exampleProperty;
    }

}
