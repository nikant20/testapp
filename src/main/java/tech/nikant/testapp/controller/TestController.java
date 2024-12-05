package tech.nikant.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String testApplication(){
        System.out.println("Hello from Test Application");
        return "SUCCESS";
    }
}
