package com.muheeb.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TrackCoach")
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Go daily for hill tracking for ";
    }

    @Override
    public int getTime() {
        return 10;
    }
}
