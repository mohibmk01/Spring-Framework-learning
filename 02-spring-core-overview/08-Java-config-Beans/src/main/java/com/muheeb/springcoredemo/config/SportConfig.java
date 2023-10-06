package com.muheeb.springcoredemo.config;

import com.muheeb.springcoredemo.common.Coach;
import com.muheeb.springcoredemo.common.SwimCoach;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach SwimCoach(){
        return new SwimCoach();
    }
}
