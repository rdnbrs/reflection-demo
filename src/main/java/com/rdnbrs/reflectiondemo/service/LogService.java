package com.rdnbrs.reflectiondemo.service;

import com.rdnbrs.reflectiondemo.repository.TestRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class LogService {

    private final ApplicationContext applicationContext;

    @SneakyThrows
    public void logInfo(String string) {
        log.info(string);
        TestRepository repositoryBean = (TestRepository) applicationContext.getBean("testRepository");
        repositoryBean.findAll();
    }
}
