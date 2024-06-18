package com.example.firstmicroservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FMController {
    @Value("message")
    private String valueFromConfigServer;

    @GetMapping("/data")
    public ResponseEntity<String> getValueFromConfigServer(){
        return ResponseEntity.ok(valueFromConfigServer);
    }
}
