package com.toby.provider.service.impl;

import com.toby.api.dto.HelloDTO;
import com.toby.provider.service.AService;
import com.toby.provider.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService {

    @Autowired
    private BService bService;

    @Override
    public int insertUser(HelloDTO helloDTO) {
        return bService.insertUser(helloDTO);
    }
}
