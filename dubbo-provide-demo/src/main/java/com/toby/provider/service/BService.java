package com.toby.provider.service;

import com.toby.api.dto.HelloDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

public interface BService {

    int insertUser(@Valid HelloDTO helloDTO);
    int insertUser(@Valid @NotEmpty String name  );
}
