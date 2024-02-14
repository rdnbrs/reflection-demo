package com.rdnbrs.reflectiondemo.controller;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@RestController
@RequestMapping("/api/v1/test")
@AllArgsConstructor
public class TestController {

    private final ApplicationContext applicationContext;

    @SneakyThrows
    @PostMapping("/")
    public void test() {
        Class<?> c = Class.forName("com.rdnbrs.reflectiondemo.service.OperationService");
        Method method = c.getDeclaredMethod("requestCheck");
        Constructor<?> conString = c.getConstructor(ApplicationContext.class);
        method.invoke(conString.newInstance(applicationContext));
    }

}
