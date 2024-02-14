package com.rdnbrs.reflectiondemo.service;

import com.rdnbrs.reflectiondemo.entity.TestEntity;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.List;

@Component
@RequiredArgsConstructor
public class OperationService {

    private final LogService logService;
    private final ApplicationContext applicationContext;

    @SneakyThrows
    public void requestCheck() {
        logService.logInfo("burasi calisiyor");
        Object repositoryBean = applicationContext.getBean("testRepository");
        Method method = repositoryBean.getClass().getMethod("findAll");
        List<TestEntity> testList = (List<TestEntity>) method.invoke(repositoryBean);
    }
}
