package com.muheeb.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // injecting custom application properties here

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // Exposing new endpoints
    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return "coach Name :"+coachName+" team name : "+teamName;
    }


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
