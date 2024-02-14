package com.rdnbrs.reflectiondemo.service;

import com.rdnbrs.reflectiondemo.repository.TestRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class LogService {

    private final TestRepository repository;

    @SneakyThrows
    public void logInfo(String string) {
        log.info(string);
        repository.findAll();
    }
}
