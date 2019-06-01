package com.toby.provider.service.impl;

import com.toby.api.dto.HelloDTO;
import com.toby.provider.service.BService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Slf4j
@Validated
public class BServiceImpl implements BService {

    @Override
    public int insertUser(HelloDTO helloDTO) {
        log.info("BService insertUser...");
        return 0;
    }

    @Override
    public int insertUser(String name) {

        return 0;
    }
}
