package com.muheeb.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "swim daily 100m for ";
    }

    @Override
    public int getTime() {
        return 10;
    }
}
