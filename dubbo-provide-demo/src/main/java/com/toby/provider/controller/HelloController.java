package com.toby.provider.controller;

import com.toby.api.dto.HelloDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloController {

    /**
     * JSR 303 对 HttpRequest 接口方法参数进行校验
     *
     * @param helloDTO
     * @return
     */
    @RequestMapping("/controllerValid")
    public String controllerValid(@RequestBody @Valid HelloDTO helloDTO) {
        return "ok";
    }

}
