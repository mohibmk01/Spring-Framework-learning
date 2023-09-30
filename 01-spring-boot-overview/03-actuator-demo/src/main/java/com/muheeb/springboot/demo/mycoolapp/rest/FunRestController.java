package com.muheeb.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/add")
    public String sayHello(){

        return "hello world";
    }
    // expose a new endpoint for  "workout"
    @GetMapping("/workout")
    public String getDailyworkout(){
        return "Run a hard !!!";
    }
    @GetMapping("/fortune")
    public String getDailyfortune(){
        return "great fortune !!!";
    }




}
