package com.muheeb.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BaseballCoach")
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Play Baseball for about ";
    }

    @Override
    public int getTime() {
        return 20;
    }
}
