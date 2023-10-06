package com.muheeb.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CricketCoach")
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "get practice of fast bowling for.";
    }

    @Override
    public int getTime() {
        return 15;
    }
}
