package com.rdnbrs.reflectiondemo.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OperationService {

    private final ApplicationContext applicationContext;

    @SneakyThrows
    public void requestCheck() {
        LogService logService = (LogService) applicationContext.getBean("logService");
        logService.logInfo("deneme burasi");
    }
}
