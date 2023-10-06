package com.muheeb.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("TrackCoach")
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("In constructor  : " +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Go daily for hill tracking for ";
    }

    @Override
    public int getTime() {
        return 10;
    }
}
