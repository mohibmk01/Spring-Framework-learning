package com.muheeb.springcoredemo.common;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CricketCoach")
// making each bean for each constructor
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor  : " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "get practice of fast bowling for.";
    }

    @Override
    public int getTime() {
        return 15;
    }
}
