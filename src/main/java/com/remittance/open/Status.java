package com.remittance.open;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/open")
public class Status {
    @GetMapping(path = "/health-status")
    public String healthStatus(){
        return "Up and running";
    }
}
