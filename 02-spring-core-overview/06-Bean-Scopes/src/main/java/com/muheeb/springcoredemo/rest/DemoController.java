package com.muheeb.springcoredemo.rest;

import com.muheeb.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private Coach myCoach;
    private Coach newCoach;


    @Autowired
    public DemoController(@Qualifier("CricketCoach") Coach theCoach,
                          @Qualifier("CricketCoach") Coach thenewCoach){
        System.out.println("In constructor  : " +getClass().getSimpleName());

        myCoach=theCoach;
        newCoach=thenewCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout() + myCoach.getTime() + "min Do It!!!!";
    }
    @GetMapping("/checkbeans")
    public String check(){
        return "Comparing beans = (myCoach == newCoach)  :  "+(myCoach==newCoach);
    }




}
