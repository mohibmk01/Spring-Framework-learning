package com.muheeb.springcoredemo.rest;

import com.muheeb.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private Coach myCoach;

    @Autowired
    public void doSumStaff(Coach theCoach) {
        myCoach = theCoach;
    }


    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout() + myCoach.getTime() + "min !!!!";
    }
}