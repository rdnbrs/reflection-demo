package com.rdnbrs.reflectiondemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
public class LogService {

    public void logInfo(String string){
        log.info(string);
    }
}
