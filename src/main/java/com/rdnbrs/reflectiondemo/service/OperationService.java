package com.rdnbrs.reflectiondemo.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@RequiredArgsConstructor
public class OperationService {

    private final ApplicationContext applicationContext;

    @SneakyThrows
    public void requestCheck() {
        Object logService = applicationContext.getBean("logService");
        Method method = logService.getClass().getMethod("logInfo", String.class);
        method.invoke(logService, "hello world");
    }
}
