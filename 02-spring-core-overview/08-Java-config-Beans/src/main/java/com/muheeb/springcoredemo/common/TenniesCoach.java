package com.muheeb.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TenniesCoach")
public class TenniesCoach implements Coach {
    public TenniesCoach(){
        System.out.println("In constructor  : " +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Play Tennies with friend for";
    }

    @Override
    public int getTime() {
        return 60;
    }
}
