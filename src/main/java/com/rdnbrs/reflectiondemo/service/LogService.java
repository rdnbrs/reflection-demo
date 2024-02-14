package com.rdnbrs.reflectiondemo.service;

import com.rdnbrs.reflectiondemo.entity.TestEntity;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.List;

@Slf4j
@Component
@AllArgsConstructor
public class LogService {

    private final ApplicationContext applicationContext;

    @SneakyThrows
    public void logInfo(String string){
        log.info(string);
        Object repositoryBean = applicationContext.getBean("testRepository");
        Method method = repositoryBean.getClass().getMethod("findAll");
        List<TestEntity> testList = (List<TestEntity>) method.invoke(repositoryBean);
    }
}
