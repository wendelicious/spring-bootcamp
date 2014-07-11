package com.dietsodasoftware.sandbox.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * User: wendel.schultz
 * Date: 7/10/14
 */
@Configuration
public class SandboxConfiguration {

    @Autowired
    private ObjectMapper mapper;

    @PostConstruct
    void init(){

        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    }

}
