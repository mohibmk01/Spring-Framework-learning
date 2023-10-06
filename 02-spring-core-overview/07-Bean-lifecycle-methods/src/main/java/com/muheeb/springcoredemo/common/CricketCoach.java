package com.muheeb.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CricketCoach")
// making each bean for each constructor
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor  : " +getClass().getSimpleName());
    }

    @PostConstruct
    public void domystuffStartup(){
        System.out.println("In domystuffStartup() "+getClass().getSimpleName());
    }
    @PreDestroy

    public void domystuffCleanup(){
        System.out.println("In domystuffCleanup() "+getClass().getSimpleName());
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
